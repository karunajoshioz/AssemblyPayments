package com.assemblypayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.assemblypayments")
public class WeatherApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}