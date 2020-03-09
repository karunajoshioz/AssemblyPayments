package com.assemblypayments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
 
	@Autowired
	private IWeatherService<ForecastResponse> weatherService;
	
	public ForecastResponse getForecast(String city) throws Exception {
		return weatherService.getForecast(city);
	}

}