package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for details of the innings
 *
 */
@JsonInclude(Include.NON_NULL)
public class InningsDetailsBean {
	
	/** Innings number (FIRST or SECOND) */
	private String inningsNumber;
	
	/** Batting Team Name Details */
	private TeamNameDetailsBean battingTeam;
	
	/** Bowling Team Name Details */
	private TeamNameDetailsBean bowlingTeam;

	/**
	 * @return the inningsNumber
	 */
	public String getInningsNumber() {
		return inningsNumber;
	}

	/**
	 * @param inningsNumber the inningsNumber to set
	 */
	public void setInningsNumber(String inningsNumber) {
		this.inningsNumber = inningsNumber;
	}

	/**
	 * @return the battingTeam
	 */
	public TeamNameDetailsBean getBattingTeam() {
		return battingTeam;
	}

	/**
	 * @param battingTeam the battingTeam to set
	 */
	public void setBattingTeam(TeamNameDetailsBean battingTeam) {
		this.battingTeam = battingTeam;
	}

	/**
	 * @return the bowlingTeam
	 */
	public TeamNameDetailsBean getBowlingTeam() {
		return bowlingTeam;
	}

	/**
	 * @param bowlingTeam the bowlingTeam to set
	 */
	public void setBowlingTeam(TeamNameDetailsBean bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}
	
}
