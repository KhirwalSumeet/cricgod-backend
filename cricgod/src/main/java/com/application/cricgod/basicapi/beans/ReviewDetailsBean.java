package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class for details of team of the reviews taken in an innings
 */
@JsonInclude(Include.NON_NULL)
public class ReviewDetailsBean {
	
	/** Details of the team who has taken the review */
	private TeamNameDetailsBean reviewerTeamDetails;
	
	/** Details of the match in which the review belongs to */
	private MatchDetailsBean matchDetails;
	
	/** Details of the innings in which the review belongs to */
	private InningsDetailsBean inningsDetails;
	
	/** Number of reviews taken */
	private int reviewsTaken;
	
	/** Number of reviews successful */
	private int reviewsSuccessful;

	/**
	 * @return the reviewerTeamDetails
	 */
	public TeamNameDetailsBean getReviewerTeamDetails() {
		return reviewerTeamDetails;
	}

	/**
	 * @param reviewerTeamDetails the reviewerTeamDetails to set
	 */
	public void setReviewerTeamDetails(TeamNameDetailsBean reviewerTeamDetails) {
		this.reviewerTeamDetails = reviewerTeamDetails;
	}

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
	 * @return the reviewsTaken
	 */
	public int getReviewsTaken() {
		return reviewsTaken;
	}

	/**
	 * @param reviewsTaken the reviewsTaken to set
	 */
	public void setReviewsTaken(int reviewsTaken) {
		this.reviewsTaken = reviewsTaken;
	}

	/**
	 * @return the reviewsSuccessful
	 */
	public int getReviewsSuccessful() {
		return reviewsSuccessful;
	}

	/**
	 * @param reviewsSuccessful the reviewsSuccessful to set
	 */
	public void setReviewsSuccessful(int reviewsSuccessful) {
		this.reviewsSuccessful = reviewsSuccessful;
	}
	
}
