package com.assemblypayments.domain.owm.service;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.assemblypayments.service.ForecastResponse;
import com.assemblypayments.service.IWeatherService;

@Component
public class OwmService implements IWeatherService<ForecastResponse> {

	private UriComponentsBuilder urlbuilder;
	private static final String API_KEY = "2326504fb9b100bee21400190e4dbe6d";
	private static final String SCHEME = "http";
	private static final String HOST = "api.openweathermap.org";
	private static final String URI = "/data/2.5/weather";

	@PostConstruct
	protected void init() {
		urlbuilder = UriComponentsBuilder.newInstance().scheme(SCHEME).host(HOST).path(URI)
				.queryParam("appid",API_KEY);
	}

	@Override
	public ForecastResponse getForecast(String city) {
		RestTemplate restTemplate = new RestTemplate();
		ForecastResponse forecastResponse = null;

		try {
			HttpHeaders headers = new HttpHeaders();
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

			HttpEntity<?> entity = new HttpEntity<>(headers);
			
			forecastResponse = new ForecastResponse();
			String url = urlbuilder.replaceQueryParam("q", city).build().toUriString();
			HttpEntity<OWMResponse> entityResponse = restTemplate.exchange(urlbuilder.build().encode().toUri(),
					HttpMethod.GET, entity, OWMResponse.class);
			
			if (entityResponse != null ) {
				forecastResponse
						.setWindSpeed(entityResponse.getBody().getMain().getTemp());
				forecastResponse
				.setTemperature(entityResponse.getBody().getWind().getSpeed());
			}
		} catch (Exception ex) {
			forecastResponse = null;
			ex.printStackTrace();
		}
		return forecastResponse;
		
	}
}
