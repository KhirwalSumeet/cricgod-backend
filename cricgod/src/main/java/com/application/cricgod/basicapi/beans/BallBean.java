package com.application.cricgod.basicapi.beans;


/**
 * Bean class about complete information of the ball in a match
 */
public class BallBean {
	
	/** Id of the ball */
	private int id;
	
	/** Details of the ball */
	private BallDetailsBean ballDetails;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the ballDetails
	 */
	public BallDetailsBean getBallDetails() {
		return ballDetails;
	}

	/**
	 * @param ballDetails the ballDetails to set
	 */
	public void setBallDetails(BallDetailsBean ballDetails) {
		this.ballDetails = ballDetails;
	}
	
}
