package com.assemblypayments.domain.owm.service;

import java.io.Serializable;

public class Wind implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deg;
	private String speed;

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

}
