package com.application.cricgod.basicapi.beans;


/**
 * Bean class about the complete information of the match
 */
public class MatchBean {
	
	/** Id of the match */
	private int id;
	
	/** Details of the match */
	private MatchDetailsBean matchDetails;

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
	 * @return the matchDetails
	 */
	public MatchDetailsBean getMatchDetails() {
		return matchDetails;
	}

	/**
	 * @param matchDetails the matchDetails to set
	 */
	public void setMatchDetails(MatchDetailsBean matchDetails) {
		this.matchDetails = matchDetails;
	}
	
}
