package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class about details of the ball
 */
@JsonInclude(Include.NON_NULL)
public class BallDetailsBean {
	
	/** Details of match the ball beloned to */
	private MatchDetailsBean matchDetails;
	
	/** Details of the bowler who has bowled the ball */
	private PlayerDetailsBean bowlerDetails;
	
	/** Details of the striker for the ball */
	private PlayerDetailsBean strikerDetails;
	
	/** Details of the non-striker for the ball */
	private PlayerDetailsBean nonStrikerDetails;
	
	/** Details of over, the ball belonged to */
	private OverDetailsBean overDetails;
	
	/** Details of innings, the ball belonged to */
	private InningsDetailsBean inningsDetails;
	
	/** Details of wicket of the ball (if any) */
	private WicketDetailsBean wicketDetails;
	
	/** Number of runs scored for the ball */
	private int runsScored;
	
	/** Extras type of the ball */
	private String extrasType;
	
	/** Boolean flag for four */
	private boolean fourFlag;
	
	/** Boolean flag for six */
	private boolean sixFlag;

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
	 * @return the strikerDetails
	 */
	public PlayerDetailsBean getStrikerDetails() {
		return strikerDetails;
	}

	/**
	 * @param strikerDetails the strikerDetails to set
	 */
	public void setStrikerDetails(PlayerDetailsBean strikerDetails) {
		this.strikerDetails = strikerDetails;
	}

	/**
	 * @return the nonStrikerDetails
	 */
	public PlayerDetailsBean getNonStrikerDetails() {
		return nonStrikerDetails;
	}

	/**
	 * @param nonStrikerDetails the nonStrikerDetails to set
	 */
	public void setNonStrikerDetails(PlayerDetailsBean nonStrikerDetails) {
		this.nonStrikerDetails = nonStrikerDetails;
	}

	/**
	 * @return the overDetails
	 */
	public OverDetailsBean getOverDetails() {
		return overDetails;
	}

	/**
	 * @param overDetails the overDetails to set
	 */
	public void setOverDetails(OverDetailsBean overDetails) {
		this.overDetails = overDetails;
	}

	/**
	 * @return the inningsDetails
	 */
	public InningsDetailsBean getInningsDetails() {
		return inningsDetails;
	}

	/**
	 * @param inningsDetails the inningsDetails to set
	 */
	public void setInningsDetails(InningsDetailsBean inningsDetails) {
		this.inningsDetails = inningsDetails;
	}

	/**
	 * @return the wicketDetails
	 */
	public WicketDetailsBean getWicketDetails() {
		return wicketDetails;
	}

	/**
	 * @param wicketDetails the wicketDetails to set
	 */
	public void setWicketDetails(WicketDetailsBean wicketDetails) {
		this.wicketDetails = wicketDetails;
	}

	/**
	 * @return the runsScored
	 */
	public int getRunsScored() {
		return runsScored;
	}

	/**
	 * @param runsScored the runsScored to set
	 */
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	/**
	 * @return the extrasType
	 */
	public String getExtrasType() {
		return extrasType;
	}

	/**
	 * @param extrasType the extrasType to set
	 */
	public void setExtrasType(String extrasType) {
		this.extrasType = extrasType;
	}

	/**
	 * @return the fourFlag
	 */
	public boolean isFourFlag() {
		return fourFlag;
	}

	/**
	 * @param fourFlag the fourFlag to set
	 */
	public void setFourFlag(boolean fourFlag) {
		this.fourFlag = fourFlag;
	}

	/**
	 * @return the sixFlag
	 */
	public boolean isSixFlag() {
		return sixFlag;
	}

	/**
	 * @param sixFlag the sixFlag to set
	 */
	public void setSixFlag(boolean sixFlag) {
		this.sixFlag = sixFlag;
	}
	
}
