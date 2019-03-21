package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete information of the team
 *
 */
@JsonInclude(Include.NON_NULL)
public class TeamBean {
	
	/** Id of a team */
	private int id;
	
	/** Details of the team */
	private TeamDetailsBean teamDetails;
	
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
	 * @return the teamDetails
	 */
	public TeamDetailsBean getTeamDetails() {
		return teamDetails;
	}

	/**
	 * @param teamDetails the teamDetails to set
	 */
	public void setTeamDetails(TeamDetailsBean teamDetails) {
		this.teamDetails = teamDetails;
	}
	
}
