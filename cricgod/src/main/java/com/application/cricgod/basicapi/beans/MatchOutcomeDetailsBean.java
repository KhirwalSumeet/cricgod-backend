package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class for details of outcome for a match
 */
@JsonInclude(Include.NON_NULL)
public class MatchOutcomeDetailsBean {
	
	/** Man of the match */
	private PlayerDetailsBean manOfMatchDetails;
	
	/** Score details of first innings */
	private InningsScoreDetailsBean firstInningsScoreDetails;
	
	/** Score details of second innings */
	private InningsScoreDetailsBean secondInningsScoreDetails;
	
	/** Flag for DL method */
	private boolean dlFlag;
	
	/** Type of outcome of the match */
	private String outcome;
	
	/** Indicates win margin (runs/wickets ccording to outcome) */
	private int winMargin;
	
	/** Indicates target runs required to win */
	private int targetRuns;
	
	/** Indicates target balls in which to reach target runs */
	private int targetBalls;

	/**
	 * @return the manOfMatchDetails
	 */
	public PlayerDetailsBean getManOfMatchDetails() {
		return manOfMatchDetails;
	}

	/**
	 * @param manOfMatchDetails the manOfMatchDetails to set
	 */
	public void setManOfMatchDetails(PlayerDetailsBean manOfMatchDetails) {
		this.manOfMatchDetails = manOfMatchDetails;
	}

	/**
	 * @return the firstInningsScoreDetails
	 */
	public InningsScoreDetailsBean getFirstInningsScoreDetails() {
		return firstInningsScoreDetails;
	}

	/**
	 * @param firstInningsScoreDetails the firstInningsScoreDetails to set
	 */
	public void setFirstInningsScoreDetails(InningsScoreDetailsBean firstInningsScoreDetails) {
		this.firstInningsScoreDetails = firstInningsScoreDetails;
	}

	/**
	 * @return the secondInningsScoreDetails
	 */
	public InningsScoreDetailsBean getSecondInningsScoreDetails() {
		return secondInningsScoreDetails;
	}

	/**
	 * @param secondInningsScoreDetails the secondInningsScoreDetails to set
	 */
	public void setSecondInningsScoreDetails(InningsScoreDetailsBean secondInningsScoreDetails) {
		this.secondInningsScoreDetails = secondInningsScoreDetails;
	}

	/**
	 * @return the dlFlag
	 */
	public boolean isDlFlag() {
		return dlFlag;
	}

	/**
	 * @param dlFlag the dlFlag to set
	 */
	public void setDlFlag(boolean dlFlag) {
		this.dlFlag = dlFlag;
	}

	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the winMargin
	 */
	public int getWinMargin() {
		return winMargin;
	}

	/**
	 * @param winMargin the winMargin to set
	 */
	public void setWinMargin(int winMargin) {
		this.winMargin = winMargin;
	}

	/**
	 * @return the targetRuns
	 */
	public int getTargetRuns() {
		return targetRuns;
	}

	/**
	 * @param targetRuns the targetRuns to set
	 */
	public void setTargetRuns(int targetRuns) {
		this.targetRuns = targetRuns;
	}

	/**
	 * @return the targetBalls
	 */
	public int getTargetBalls() {
		return targetBalls;
	}

	/**
	 * @param targetBalls the targetBalls to set
	 */
	public void setTargetBalls(int targetBalls) {
		this.targetBalls = targetBalls;
	}
	
}
