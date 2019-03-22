package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for details of the weather
 *
 */
@JsonInclude(Include.NON_NULL)
public class WeatherDetailsBean {
	
	/** Temparature of the weather */
	private double temparature;
	
	/** Humidity of the weather */
	private double humidity;
	
	/** Percentage of chances of rainfall */
	private double rainfallChances;

	/**
	 * @return the temparature
	 */
	public double getTemparature() {
		return temparature;
	}

	/**
	 * @param temparature the temparature to set
	 */
	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}

	/**
	 * @return the humidity
	 */
	public double getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the rainfallChances
	 */
	public double getRainfallChances() {
		return rainfallChances;
	}

	/**
	 * @param rainfallChances the rainfallChances to set
	 */
	public void setRainfallChances(double rainfallChances) {
		this.rainfallChances = rainfallChances;
	}
	
}