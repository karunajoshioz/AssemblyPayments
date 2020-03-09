
package com.assemblypayments.service;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForecastResponse implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("wind_speed")
    private String windSpeed;
    
    @JsonProperty("temperature")
    private String temperature;
    

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}



}
