package com.assemblypayments.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assemblypayments.service.ForecastResponse;
import com.assemblypayments.service.WeatherService;;

@RestController
public class WeatherAppController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/v1/weather")
	public ResponseEntity<ForecastResponse> getForcast(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		ForecastResponse forecastResp = weatherService.getForecast("Melbourne");
		ResponseEntity<ForecastResponse> responseEntity = new ResponseEntity<>(forecastResp, HttpStatus.OK);
		return responseEntity;
	}
}
