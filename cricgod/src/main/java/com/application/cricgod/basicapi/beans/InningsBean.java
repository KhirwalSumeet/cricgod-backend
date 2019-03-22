package com.application.cricgod.basicapi.beans;


/**
 * Bean class for complete information of the innings
 *
 */
public class InningsBean {
	
	/** Id of the innings */
	private int id;
	
	/** Details of teh innings */
	private InningsDetailsBean inningsDetails;

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
