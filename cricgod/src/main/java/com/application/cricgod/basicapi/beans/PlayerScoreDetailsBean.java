package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class about details of the runs scored by the player in a match
 */
@JsonInclude(Include.NON_NULL)
public class PlayerScoreDetailsBean {
	
	/** Details of match, these score details belongs to */
	private MatchDetailsBean matchDetails;
	
	/** Details of innings, these score details belongs to */
	private InningsDetailsBean inningsDetails;
	
	/** Details of wicket of the player in match (if any) */
	private WicketDetailsBean wicketDetails;
	
	/** Details of player these score details belongs to*/
	private PlayerDetailsBean playerDetails;
	
	/** Number of balls played by the player */
	private int ballsPlyaed;
	
	/** Number of runs socred by the player */
	private int runsScored;
	
	/** Number of dots played by the player */
	private int dots;
	
	/** Number of singles socred by the player */
	private int ones;
	
	/** Number of twos socred by the player */
	private int twos;
	
	/** Number of threes socred by the player */
	private int threes;
	
	/** Number of fours socred by the player */
	private int fours;
	
	/** Number of fives socred by the player */
	private int fives;
	
	/** Number of sixes socred by the player */
	private int sixes;

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
	 * @return the ballsPlyaed
	 */
	public int getBallsPlyaed() {
		return ballsPlyaed;
	}

	/**
	 * @param ballsPlyaed the ballsPlyaed to set
	 */
	public void setBallsPlyaed(int ballsPlyaed) {
		this.ballsPlyaed = ballsPlyaed;
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
	 * @return the dots
	 */
	public int getDots() {
		return dots;
	}

	/**
	 * @param dots the dots to set
	 */
	public void setDots(int dots) {
		this.dots = dots;
	}

	/**
	 * @return the ones
	 */
	public int getOnes() {
		return ones;
	}

	/**
	 * @param ones the ones to set
	 */
	public void setOnes(int ones) {
		this.ones = ones;
	}

	/**
	 * @return the twos
	 */
	public int getTwos() {
		return twos;
	}

	/**
	 * @param twos the twos to set
	 */
	public void setTwos(int twos) {
		this.twos = twos;
	}

	/**
	 * @return the threes
	 */
	public int getThrees() {
		return threes;
	}

	/**
	 * @param threes the threes to set
	 */
	public void setThrees(int threes) {
		this.threes = threes;
	}

	/**
	 * @return the fours
	 */
	public int getFours() {
		return fours;
	}

	/**
	 * @param fours the fours to set
	 */
	public void setFours(int fours) {
		this.fours = fours;
	}

	/**
	 * @return the fives
	 */
	public int getFives() {
		return fives;
	}

	/**
	 * @param fives the fives to set
	 */
	public void setFives(int fives) {
		this.fives = fives;
	}

	/**
	 * @return the sixes
	 */
	public int getSixes() {
		return sixes;
	}

	/**
	 * @param sixes the sixes to set
	 */
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	
}
