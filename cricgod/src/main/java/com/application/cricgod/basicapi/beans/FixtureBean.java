package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete information of the fixture
 *
 */
@JsonInclude(Include.NON_NULL)
public class FixtureBean {
	
	/** Id of the fixture */
	private int id;
	
	/** Details of the fixture */
	private FixtureDetailsBean fixtureDetails;

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
	 * @return the fixtureDetails
	 */
	public FixtureDetailsBean getFixtureDetails() {
		return fixtureDetails;
	}

	/**
	 * @param fixtureDetails the fixtureDetails to set
	 */
	public void setFixtureDetails(FixtureDetailsBean fixtureDetails) {
		this.fixtureDetails = fixtureDetails;
	}
	
}
