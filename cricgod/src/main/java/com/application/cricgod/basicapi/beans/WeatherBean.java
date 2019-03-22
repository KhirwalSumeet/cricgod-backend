package com.application.cricgod.basicapi.beans;


/**
 * Bean class for complete information of the weather
 *
 */
public class WeatherBean {
	
	/** Id of the weather */
	private int id;
	
	/** Deatils of the weather */
	private WeatherDetailsBean weatherDetails;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the weatherDetails
	 */
	public WeatherDetailsBean getWeatherDetails() {
		return weatherDetails;
	}

	/**
	 * @param weatherDetails the weatherDetails to set
	 */
	public void setWeatherDetails(WeatherDetailsBean weatherDetails) {
		this.weatherDetails = weatherDetails;
	}
	
}
