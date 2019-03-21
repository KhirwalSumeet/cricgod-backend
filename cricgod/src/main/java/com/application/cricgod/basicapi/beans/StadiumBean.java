package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete stadium information
 *
 */
@JsonInclude(Include.NON_NULL)
public class StadiumBean {
	
	/** Id of the stadium */
	private int id;
	
	/** Object of details of the stadium  */
	private StadiumDetailsBean stadiumDetails;

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
	 * @return the stadiumDetails
	 */
	public StadiumDetailsBean getStadiumDetails() {
		return stadiumDetails;
	}

	/**
	 * @param stadiumDetails the stadiumDetails to set
	 */
	public void setStadiumDetails(StadiumDetailsBean stadiumDetails) {
		this.stadiumDetails = stadiumDetails;
	}
	
}
