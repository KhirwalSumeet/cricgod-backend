package com.application.cricgod.basicapi.beans;


/**
 * Bean class about complete information of an over
 */
public class OverBean {
	
	/** Id of the over */
	private int id;
	
	/** Details of the over */
	private OverDetailsBean overDetails;

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
	
}
