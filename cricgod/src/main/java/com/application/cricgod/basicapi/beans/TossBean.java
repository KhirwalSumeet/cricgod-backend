package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete information of toss
 *
 */
@JsonInclude(Include.NON_NULL)
public class TossBean {
	
	/** Id of the toss */
	private int id;
	
	/** Details of the toss */
	private TossDetailsBean tossDetails;

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
	 * @return the tossDetails
	 */
	public TossDetailsBean getTossDetails() {
		return tossDetails;
	}

	/**
	 * @param tossDetails the tossDetails to set
	 */
	public void setTossDetails(TossDetailsBean tossDetails) {
		this.tossDetails = tossDetails;
	}
	
}
