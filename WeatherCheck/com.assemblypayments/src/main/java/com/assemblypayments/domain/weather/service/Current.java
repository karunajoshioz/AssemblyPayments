package com.assemblypayments.domain.weather.service;

import java.io.Serializable;

public class Current implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] weather_descriptions;
	private String observation_time;
	private String wind_degree;
	private String visibility;
	private String[] weather_icons;
	private String feelslike;
	private String is_day;
	private String wind_dir;
	private String pressure;
	private String cloudcover;
	private String precip;
	private String uv_index;
	private String temperature;
	private String humidity;
	private String wind_speed;
	private String weather_code;

	
	
	public String[] getWeather_descriptions() {
		return weather_descriptions;
	}

	public void setWeather_descriptions(String[] weather_descriptions) {
		this.weather_descriptions = weather_descriptions;
	}

	public String getObservation_time() {
		return observation_time;
	}

	public void setObservation_time(String observation_time) {
		this.observation_time = observation_time;
	}

	public String getWind_degree() {
		return wind_degree;
	}

	public void setWind_degree(String wind_degree) {
		this.wind_degree = wind_degree;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String[] getWeather_icons() {
		return weather_icons;
	}

	public void setWeather_icons(String[] weather_icons) {
		this.weather_icons = weather_icons;
	}

	public String getFeelslike() {
		return feelslike;
	}

	public void setFeelslike(String feelslike) {
		this.feelslike = feelslike;
	}

	public String getIs_day() {
		return is_day;
	}

	public void setIs_day(String is_day) {
		this.is_day = is_day;
	}

	public String getWind_dir() {
		return wind_dir;
	}

	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getCloudcover() {
		return cloudcover;
	}

	public void setCloudcover(String cloudcover) {
		this.cloudcover = cloudcover;
	}

	public String getPrecip() {
		return precip;
	}

	public void setPrecip(String precip) {
		this.precip = precip;
	}

	public String getUv_index() {
		return uv_index;
	}

	public void setUv_index(String uv_index) {
		this.uv_index = uv_index;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(String wind_speed) {
		this.wind_speed = wind_speed;
	}

	public String getWeather_code() {
		return weather_code;
	}

	public void setWeather_code(String weather_code) {
		this.weather_code = weather_code;
	}

}
