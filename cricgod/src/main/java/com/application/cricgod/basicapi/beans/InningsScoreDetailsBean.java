package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for details of score in an innings
 *
 */
@JsonInclude(Include.NON_NULL)
public class InningsScoreDetailsBean {
	
	/** Runs scored in the innings */
	private int runs;
	
	/** Wickets fallen in the innings */
	private int wickets;
	
	/** Number of balls played in the innings */
	private  int ballsPlayed;
	
	/** Total number of balls in the innings */
	private int totalBalls;
	
	/** Details of the innings */
	private InningsDetailsBean inningsDetails;

	/**
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}

	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}

	/**
	 * @return the wickets
	 */
	public int getWickets() {
		return wickets;
	}

	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	/**
	 * @return the ballsPlayed
	 */
	public int getBallsPlayed() {
		return ballsPlayed;
	}

	/**
	 * @param ballsPlayed the ballsPlayed to set
	 */
	public void setBallsPlayed(int ballsPlayed) {
		this.ballsPlayed = ballsPlayed;
	}

	/**
	 * @return the totalBalls
	 */
	public int getTotalBalls() {
		return totalBalls;
	}

	/**
	 * @param totalBalls the totalBalls to set
	 */
	public void setTotalBalls(int totalBalls) {
		this.totalBalls = totalBalls;
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
	
}
