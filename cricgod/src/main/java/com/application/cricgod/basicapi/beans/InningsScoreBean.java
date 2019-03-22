package com.application.cricgod.basicapi.beans;


/**
 * Bean class for complete information of score in an innings
 */
public class InningsScoreBean {
	
	/** Id of the innings score */
	private int id;
	
	/** Details of the score of an innings */
	private InningsScoreDetailsBean inningsScoreDetails;

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
	 * @return the inningsScoreDetails
	 */
	public InningsScoreDetailsBean getInningsScoreDetails() {
		return inningsScoreDetails;
	}

	/**
	 * @param inningsScoreDetails the inningsScoreDetails to set
	 */
	public void setInningsScoreDetails(InningsScoreDetailsBean inningsScoreDetails) {
		this.inningsScoreDetails = inningsScoreDetails;
	}
	
}
