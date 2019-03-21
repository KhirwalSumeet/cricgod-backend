package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for details of the stadium
 *
 */
@JsonInclude(Include.NON_NULL)
public class StadiumDetailsBean {
	
	/** Name of the stadium */
	private String name;
	
	/** City in which stadium is present*/
	private String city;
	
	/** Country in which stadium is present */
	private String country;
	
	/** Seating capacity of the stadium */
	private int capacity;
	
	/** Object of stadium boundary lengths  */
	private StadiumBoundaryDetailsBean stadiumBoundaryDetails;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the stadiumBoundaryDetails
	 */
	public StadiumBoundaryDetailsBean getStadiumBoundaryDetails() {
		return stadiumBoundaryDetails;
	}

	/**
	 * @param stadiumBoundaryDetails the stadiumBoundaryDetails to set
	 */
	public void setStadiumBoundaryDetails(StadiumBoundaryDetailsBean stadiumBoundaryDetails) {
		this.stadiumBoundaryDetails = stadiumBoundaryDetails;
	}
	
}
