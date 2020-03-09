package com.assemblypayments.domain.weather.service;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
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
@Primary
public class WeatherStackService implements IWeatherService<ForecastResponse> {

	private static final String API_KEY = "3c30ca3fd48b4b18b34ad2550fe5a93c";
	private static final String SCHEME = "http";
	private static final String HOST = "api.weatherstack.com";
	private static final String URI = "/current";
	private UriComponentsBuilder urlbuilder;

	@PostConstruct
	protected void init() {
		urlbuilder = UriComponentsBuilder.newInstance().scheme(SCHEME).host(HOST).path(URI).queryParam("access_key",
				API_KEY);
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
			String url = urlbuilder.replaceQueryParam("query", city).build().toUriString();
			HttpEntity<WeatherStackResponse> entityResponse = restTemplate.exchange(urlbuilder.build().encode().toUri(),
					HttpMethod.GET, entity, WeatherStackResponse.class);

			if (entityResponse != null ) {
				forecastResponse
						.setWindSpeed(entityResponse.getBody().getCurrent().getWind_speed());
				forecastResponse
				.setTemperature(entityResponse.getBody().getCurrent().getTemperature());
			}
		} catch (Exception ex) {
			forecastResponse = null;
			ex.printStackTrace();
		}
		return forecastResponse;
	}

}
