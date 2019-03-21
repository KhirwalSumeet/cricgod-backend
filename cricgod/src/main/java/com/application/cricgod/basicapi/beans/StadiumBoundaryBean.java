package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean Class for Stadium Boundary information
 */
@JsonInclude(Include.NON_NULL)
public class StadiumBoundaryBean {
	
	/** Id of the Stadium boundary */
	private int id;
	
	/** Object of details of Stadium boundary lengths  */
	private StadiumBoundaryDetailsBean stadiumBoundaryDetails;

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
