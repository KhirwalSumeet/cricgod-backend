package com.application.cricgod.basicapi.beans;


/**
 * Bean class for complete information of outcome of the match
 */
public class MatchOutcomeBean {
	
	/** Id of the outcome of the match */
	private int id;
	
	/** Details of outcome of the match */
	private MatchOutcomeDetailsBean matchOutcomeDetails;

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
	 * @return the matchOutcomeDetails
	 */
	public MatchOutcomeDetailsBean getMatchOutcomeDetails() {
		return matchOutcomeDetails;
	}

	/**
	 * @param matchOutcomeDetails the matchOutcomeDetails to set
	 */
	public void setMatchOutcomeDetails(MatchOutcomeDetailsBean matchOutcomeDetails) {
		this.matchOutcomeDetails = matchOutcomeDetails;
	}
	
}
