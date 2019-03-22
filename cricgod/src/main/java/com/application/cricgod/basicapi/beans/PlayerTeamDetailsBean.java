package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class about details of team that the player belonged to in a particular uear
 */
@JsonInclude(Include.NON_NULL)
public class PlayerTeamDetailsBean {
	
	/** Details of the player */
	private PlayerDetailsBean playerDetails;
	
	/** Details of team that theplayer belonged to */
	private TeamNameDetailsBean teamNameDetails;
	
	/** Details of  year in which the player belonged to the team */
	private int year;
	
	/** Auction value of the player for that year in the team */
	private int auctionValue;

	/**
	 * @return the playerDetails
	 */
	public PlayerDetailsBean getPlayerDetails() {
		return playerDetails;
	}

	/**
	 * @param playerDetails the playerDetails to set
	 */
	public void setPlayerDetails(PlayerDetailsBean playerDetails) {
		this.playerDetails = playerDetails;
	}

	/**
	 * @return the teamNameDetails
	 */
	public TeamNameDetailsBean getTeamNameDetails() {
		return teamNameDetails;
	}

	/**
	 * @param teamNameDetails the teamNameDetails to set
	 */
	public void setTeamNameDetails(TeamNameDetailsBean teamNameDetails) {
		this.teamNameDetails = teamNameDetails;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the auctionValue
	 */
	public int getAuctionValue() {
		return auctionValue;
	}

	/**
	 * @param auctionValue the auctionValue to set
	 */
	public void setAuctionValue(int auctionValue) {
		this.auctionValue = auctionValue;
	}
	
}
