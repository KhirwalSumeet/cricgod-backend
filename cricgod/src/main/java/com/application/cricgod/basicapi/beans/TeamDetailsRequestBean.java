package com.application.cricgod.basicapi.beans;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TeamDetailsRequestBean {
	
	/** Id of the team */
	private String id = "0";
	
	/** Flag stating whether teamName details are required or not (default = true) */
	private String teamNameFlag = "true";
	
	/** Flag stating whether squad details are required or not (default = true) */
	private String squadDetailsFlag = "true";
	
	/** Flag stating whether team fixture details are required or not (default = true) */
	private String fixtureDetailsFlag = "true";
	
	/** Flag stating whether team social media details are required or not (default = true) */
	private String socialMediaDetailsFlag = "true";
	
	/** Flag stating whether home-ground details are required or not (default = true) */
	private String homeGroundDetailsFlag = "true";
	
	/** Flag stating whether team owner details are required or not (default = true) */
	private String ownerDetailsFlag = "true";
	
	/** Year to be searched for (default = current year) */
	private String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the teamNameFlag
	 */
	public String getTeamNameFlag() {
		return teamNameFlag;
	}

	/**
	 * @param teamNameFlag the teamNameFlag to set
	 */
	public void setTeamNameFlag(String teamNameFlag) {
		this.teamNameFlag = teamNameFlag;
	}

	/**
	 * @return the squadDetailsFlag
	 */
	public String getSquadDetailsFlag() {
		return squadDetailsFlag;
	}

	/**
	 * @param squadDetailsFlag the squadDetailsFlag to set
	 */
	public void setSquadDetailsFlag(String squadDetailsFlag) {
		this.squadDetailsFlag = squadDetailsFlag;
	}

	/**
	 * @return the fixtureDetailsFlag
	 */
	public String getFixtureDetailsFlag() {
		return fixtureDetailsFlag;
	}

	/**
	 * @param fixtureDetailsFlag the fixtureDetailsFlag to set
	 */
	public void setFixtureDetailsFlag(String fixtureDetailsFlag) {
		this.fixtureDetailsFlag = fixtureDetailsFlag;
	}

	/**
	 * @return the socialMediaDetailsFlag
	 */
	public String getSocialMediaDetailsFlag() {
		return socialMediaDetailsFlag;
	}

	/**
	 * @param socialMediaDetailsFlag the socialMediaDetailsFlag to set
	 */
	public void setSocialMediaDetailsFlag(String socialMediaDetailsFlag) {
		this.socialMediaDetailsFlag = socialMediaDetailsFlag;
	}

	/**
	 * @return the homeGroundDetailsFlag
	 */
	public String getHomeGroundDetailsFlag() {
		return homeGroundDetailsFlag;
	}

	/**
	 * @param homeGroundDetailsFlag the homeGroundDetailsFlag to set
	 */
	public void setHomeGroundDetailsFlag(String homeGroundDetailsFlag) {
		this.homeGroundDetailsFlag = homeGroundDetailsFlag;
	}

	/**
	 * @return the ownerDetailsFlag
	 */
	public String getOwnerDetailsFlag() {
		return ownerDetailsFlag;
	}

	/**
	 * @param ownerDetailsFlag the ownerDetailsFlag to set
	 */
	public void setOwnerDetailsFlag(String ownerDetailsFlag) {
		this.ownerDetailsFlag = ownerDetailsFlag;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
