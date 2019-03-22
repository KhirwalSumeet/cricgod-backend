package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class about details of the over
 */
@JsonInclude(Include.NON_NULL)
public class OverDetailsBean {
	
	/** Details of  match the over belongs to */
	private MatchDetailsBean matchDetails;
	
	/** Details of innings the over belongs to in a match */
	private InningsDetailsBean inningsDetails;
	
	/** Details of the bowler who has has bowled the over */
	private PlayerDetailsBean bowlerDetails;
	
	/** Number of runs socred in the over */
	private int runsScored;
	
	/** Number of wickets taken in the over */
	private int wicketsTaken;
	
	/** Number of extra runs in the over */
	private int extraRuns;
	
	/** Number of dots in the over */
	private int dots;
	
	/** Number of singles in the over */
	private int ones;
	
	/** Number of twos in the over */
	private int twos;
	
	/** Number of threes in the over */
	private int threes;
	
	/** Number of fours in the over */
	private int fours;
	
	/** Number of fives in the over */
	private int fives;
	
	/** Number of sixes in the over */
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
	 * @return the wicketsTaken
	 */
	public int getWicketsTaken() {
		return wicketsTaken;
	}

	/**
	 * @param wicketsTaken the wicketsTaken to set
	 */
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	/**
	 * @return the extraRuns
	 */
	public int getExtraRuns() {
		return extraRuns;
	}

	/**
	 * @param extraRuns the extraRuns to set
	 */
	public void setExtraRuns(int extraRuns) {
		this.extraRuns = extraRuns;
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
