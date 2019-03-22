package com.application.cricgod.basicapi.beans;


/**
 * Bean class for complete information of teams involved in the match
 */
public class MatchTeamBean {
	
	/** Id of the match teams */
	private int id;
	
	/** Details of teams involved in the match */
	private MatchTeamDetailsBean matchTeamDetails;

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
	 * @return the matchTeamDetails
	 */
	public MatchTeamDetailsBean getMatchTeamDetails() {
		return matchTeamDetails;
	}

	/**
	 * @param matchTeamDetails the matchTeamDetails to set
	 */
	public void setMatchTeamDetails(MatchTeamDetailsBean matchTeamDetails) {
		this.matchTeamDetails = matchTeamDetails;
	}
	
}
