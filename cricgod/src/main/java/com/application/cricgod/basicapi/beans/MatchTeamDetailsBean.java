package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for details of team of the match
 */
@JsonInclude(Include.NON_NULL)
public class MatchTeamDetailsBean {
	
	/** First team details */
	private TeamNameDetailsBean firstTeamNameDetails;
	
	/** Second team details */
	private TeamNameDetailsBean secondTeamNameDetails;
	
	/** Captain details of first team */
	private PlayerDetailsBean firstTeamCaptainDetails;
	
	/** Captain details of second team */
	private PlayerDetailsBean secondTeamCaptainDetails;
	
	/** Vice-Captain details of first team */
	private PlayerDetailsBean firstTeamViceCaptainDetails;
	
	/** Vice-Captain details of second team */
	private PlayerDetailsBean secondTeamViceCaptainDetails;

	/**
	 * @return the firstTeamNameDetails
	 */
	public TeamNameDetailsBean getFirstTeamNameDetails() {
		return firstTeamNameDetails;
	}

	/**
	 * @param firstTeamNameDetails the firstTeamNameDetails to set
	 */
	public void setFirstTeamNameDetails(TeamNameDetailsBean firstTeamNameDetails) {
		this.firstTeamNameDetails = firstTeamNameDetails;
	}

	/**
	 * @return the secondTeamNameDetails
	 */
	public TeamNameDetailsBean getSecondTeamNameDetails() {
		return secondTeamNameDetails;
	}

	/**
	 * @param secondTeamNameDetails the secondTeamNameDetails to set
	 */
	public void setSecondTeamNameDetails(TeamNameDetailsBean secondTeamNameDetails) {
		this.secondTeamNameDetails = secondTeamNameDetails;
	}

	/**
	 * @return the firstTeamCaptainDetails
	 */
	public PlayerDetailsBean getFirstTeamCaptainDetails() {
		return firstTeamCaptainDetails;
	}

	/**
	 * @param firstTeamCaptainDetails the firstTeamCaptainDetails to set
	 */
	public void setFirstTeamCaptainDetails(PlayerDetailsBean firstTeamCaptainDetails) {
		this.firstTeamCaptainDetails = firstTeamCaptainDetails;
	}

	/**
	 * @return the secondTeamCaptainDetails
	 */
	public PlayerDetailsBean getSecondTeamCaptainDetails() {
		return secondTeamCaptainDetails;
	}

	/**
	 * @param secondTeamCaptainDetails the secondTeamCaptainDetails to set
	 */
	public void setSecondTeamCaptainDetails(PlayerDetailsBean secondTeamCaptainDetails) {
		this.secondTeamCaptainDetails = secondTeamCaptainDetails;
	}

	/**
	 * @return the firstTeamViceCaptainDetails
	 */
	public PlayerDetailsBean getFirstTeamViceCaptainDetails() {
		return firstTeamViceCaptainDetails;
	}

	/**
	 * @param firstTeamViceCaptainDetails the firstTeamViceCaptainDetails to set
	 */
	public void setFirstTeamViceCaptainDetails(PlayerDetailsBean firstTeamViceCaptainDetails) {
		this.firstTeamViceCaptainDetails = firstTeamViceCaptainDetails;
	}

	/**
	 * @return the secondTeamViceCaptainDetails
	 */
	public PlayerDetailsBean getSecondTeamViceCaptainDetails() {
		return secondTeamViceCaptainDetails;
	}

	/**
	 * @param secondTeamViceCaptainDetails the secondTeamViceCaptainDetails to set
	 */
	public void setSecondTeamViceCaptainDetails(PlayerDetailsBean secondTeamViceCaptainDetails) {
		this.secondTeamViceCaptainDetails = secondTeamViceCaptainDetails;
	}
	
}
