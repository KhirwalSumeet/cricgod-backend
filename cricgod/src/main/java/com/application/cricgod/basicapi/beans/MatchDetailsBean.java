package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class about details of the match
 */
@JsonInclude(Include.NON_NULL)
public class MatchDetailsBean {
	
	/** Details of teams involved in the match */
	private MatchTeamDetailsBean matchTeamDetails;
	
	/** Details of toss in the match */
	private TossDetailsBean tossDetails;
	
	/** Details of stadium where the match occurs/occured */
	private StadiumDetailsBean stadiumDetails;
	
	/** Details of weather in the match */
	private WeatherDetailsBean weatherDetails;
	
	/** Details of outcome of the match */
	private MatchOutcomeDetailsBean matchOutcomeDetails;

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

	/**
	 * @return the tossDetails
	 */
	public TossDetailsBean getTossDetails() {
		return tossDetails;
	}

	/**
	 * @param tossDetails the tossDetails to set
	 */
	public void setTossDetails(TossDetailsBean tossDetails) {
		this.tossDetails = tossDetails;
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
	 * @return the weatherDetails
	 */
	public WeatherDetailsBean getWeatherDetails() {
		return weatherDetails;
	}

	/**
	 * @param weatherDetails the weatherDetails to set
	 */
	public void setWeatherDetails(WeatherDetailsBean weatherDetails) {
		this.weatherDetails = weatherDetails;
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
