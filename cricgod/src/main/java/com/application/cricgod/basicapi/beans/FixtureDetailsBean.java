package com.application.cricgod.basicapi.beans;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class for details of the fixture
 *
 */
@JsonInclude(Include.NON_NULL)
public class FixtureDetailsBean {
	
	/** Year of the fixture */
	private int year;
	
	/** Date of the fixture */
	private LocalDateTime fixtureDateAndTime;
	
	/** Details of stadium for the fixture */
	private StadiumDetailsBean stadiumDetails;
	
	/** Details of team1 name*/
	private TeamNameDetailsBean team1;
	
	/** Details of team2 name*/
	private TeamNameDetailsBean team2;
	
	
	/**
	 * This method assigns all the attributes to null
	 */
	public void makeNull() {
		//this.year = null;
		this.fixtureDateAndTime = null;
		this.stadiumDetails = null;
		this.team1 = null;
		this.team2 = null;
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
	 * @return the fixtureDateAndTime
	 */
	public LocalDateTime getFixtureDateAndTime() {
		return fixtureDateAndTime;
	}

	/**
	 * @param fixtureDateAndTime the fixtureDateAndTime to set
	 */
	public void setFixtureDateAndTime(LocalDateTime fixtureDateAndTime) {
		this.fixtureDateAndTime = fixtureDateAndTime;
	}

	/**
	 * @return the stadiumDetails
	 */
	public StadiumDetailsBean getStadiumDetails() {
		return stadiumDetails;
	}

	/**
	 * @param stadiumDetails the stadiumDetails to set
	 */
	public void setStadiumDetails(StadiumDetailsBean stadiumDetails) {
		this.stadiumDetails = stadiumDetails;
	}

	/**
	 * @return the team1
	 */
	public TeamNameDetailsBean getTeam1() {
		return team1;
	}

	/**
	 * @param team1 the team1 to set
	 */
	public void setTeam1(TeamNameDetailsBean team1) {
		this.team1 = team1;
	}

	/**
	 * @return the team2
	 */
	public TeamNameDetailsBean getTeam2() {
		return team2;
	}

	/**
	 * @param team2 the team2 to set
	 */
	public void setTeam2(TeamNameDetailsBean team2) {
		this.team2 = team2;
	}
	
}
