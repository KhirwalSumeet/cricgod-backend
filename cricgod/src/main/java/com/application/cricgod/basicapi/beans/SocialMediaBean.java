package com.application.cricgod.basicapi.beans;


public class SocialMediaBean {
	
	/** Id of the soical media */
	private int id;
	
	/** List of all social media's */
	private SocialMediaDetailsBean socialMediaDetails;

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
	 * @return the socialMediaDetails
	 */
	public SocialMediaDetailsBean getSocialMediaDetails() {
		return socialMediaDetails;
	}

	/**
	 * @param socialMediaDetails the socialMediaDetails to set
	 */
	public void setSocialMediaDetails(SocialMediaDetailsBean socialMediaDetails) {
		this.socialMediaDetails = socialMediaDetails;
	}
	
}
