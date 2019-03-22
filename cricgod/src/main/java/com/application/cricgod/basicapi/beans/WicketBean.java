package com.application.cricgod.basicapi.beans;


/**
 * Bean class about the complete information of the wicket
 */
public class WicketBean {
	
	/** Id of the wicket */
	private int id;
	
	/** Details of the wicket */
	private WicketDetailsBean wicketDetails;

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
	
}
