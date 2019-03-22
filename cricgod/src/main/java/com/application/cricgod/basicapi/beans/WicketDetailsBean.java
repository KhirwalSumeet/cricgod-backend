package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class about details of a wicket in the match
 */
@JsonInclude(Include.NON_NULL)
public class WicketDetailsBean {
	
	/** Type of wicket */
	private String wicketType;
	
	/** Details of match, the wicket belons to */
	private MatchDetailsBean matchDetails;
	
	/** Details of bowler for the wicket */
	private PlayerDetailsBean bowlerDetails;
	
	/** Details of fielder for the wicket */
	private PlayerDetailsBean fielderDetails;
	
	/** Details of the player whose wicket has fallen */
	private PlayerDetailsBean playerOutDetails;

	/**
	 * @return the wicketType
	 */
	public String getWicketType() {
		return wicketType;
	}

	/**
	 * @param wicketType the wicketType to set
	 */
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
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

	/**
	 * @return the bowlerDetails
	 */
	public PlayerDetailsBean getBowlerDetails() {
		return bowlerDetails;
	}

	/**
	 * @param bowlerDetails the bowlerDetails to set
	 */
	public void setBowlerDetails(PlayerDetailsBean bowlerDetails) {
		this.bowlerDetails = bowlerDetails;
	}

	/**
	 * @return the fielderDetails
	 */
	public PlayerDetailsBean getFielderDetails() {
		return fielderDetails;
	}

	/**
	 * @param fielderDetails the fielderDetails to set
	 */
	public void setFielderDetails(PlayerDetailsBean fielderDetails) {
		this.fielderDetails = fielderDetails;
	}

	/**
	 * @return the playerOutDetails
	 */
	public PlayerDetailsBean getPlayerOutDetails() {
		return playerOutDetails;
	}

	/**
	 * @param playerOutDetails the playerOutDetails to set
	 */
	public void setPlayerOutDetails(PlayerDetailsBean playerOutDetails) {
		this.playerOutDetails = playerOutDetails;
	}
	
}
