package com.application.cricgod.basicapi.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class for details of the team
 *
 */
@JsonInclude(Include.NON_NULL)
public class TeamDetailsBean {
	
	/** Details of team name and its abbreviation */
	private TeamNameDetailsBean teamNameDetails;
	
	/** Squad details of the team */
	private List<PlayerDetailsBean> squadDetails;
	
	/** Fixture details of the team */
	private List<FixtureDetailsBean> fixtureDetails;
	
	/** Social media details of the team */
	private List<SocialMediaDetailsBean> socialMediaDetails;
	
	/** Homeground of the team */
	private StadiumDetailsBean homeGroundDetails;
	
	/** Owner of the team */
	private String owner;

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
	 * @return the squadDetails
	 */
	public List<PlayerDetailsBean> getSquadDetails() {
		return squadDetails;
	}

	/**
	 * @param squadDetails the squadDetails to set
	 */
	public void setSquadDetails(List<PlayerDetailsBean> squadDetails) {
		this.squadDetails = squadDetails;
	}

	/**
	 * @return the fixtureDetails
	 */
	public List<FixtureDetailsBean> getFixtureDetails() {
		return fixtureDetails;
	}

	/**
	 * @param fixtureDetails the fixtureDetails to set
	 */
	public void setFixtureDetails(List<FixtureDetailsBean> fixtureDetails) {
		this.fixtureDetails = fixtureDetails;
	}
	
	/**
	 * @return the socialMediaDetails
	 */
	public List<SocialMediaDetailsBean> getSocialMediaDetails() {
		return socialMediaDetails;
	}

	/**
	 * @param socialMediaDetails the socialMediaDetails to set
	 */
	public void setSocialMediaDetails(List<SocialMediaDetailsBean> socialMediaDetails) {
		this.socialMediaDetails = socialMediaDetails;
	}
	
	/**
	 * @return the homeGroundDetails
	 */
	public StadiumDetailsBean getHomeGroundDetails() {
		return homeGroundDetails;
	}

	/**
	 * @param homeGroundDetails the homeGroundDetails to set
	 */
	public void setHomeGroundDetails(StadiumDetailsBean homeGroundDetails) {
		this.homeGroundDetails = homeGroundDetails;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
