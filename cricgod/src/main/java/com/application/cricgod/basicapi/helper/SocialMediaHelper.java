package com.application.cricgod.basicapi.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.cricgod.basicapi.beans.SocialMediaDetailsBean;
import com.application.cricgod.entity.SocialMediaTeamMapping;


/**
 * This is social-media related helper class
 */
@Component
public class SocialMediaHelper {
	
	/**
	 * This method maps list of SocialMediaTeamMapping Entities to list of SocialMediaDetails Beans
	 * @param players : List of SocialMediaTeamMapping entities 
	 * 
	 * @return List of SocialMediaDetails Bean objects
	 */
	public List<SocialMediaDetailsBean> mapSocialMediasDetails(List<SocialMediaTeamMapping> socialMedias) {
		List<SocialMediaDetailsBean> socialMediasDetails = new ArrayList<SocialMediaDetailsBean>();
		for(SocialMediaTeamMapping socialMedia : socialMedias) {
			socialMediasDetails.add(mapSocialMediaDetails(socialMedia));
		}
		
		return socialMediasDetails;
	}
	
	/**
	 * This method maps Fixture Entity to PlayerDetails Bean
	 * @param player : Fixture entity object
	 * 
	 * @return Object of FixtureDetails Bean
	 */
	public SocialMediaDetailsBean mapSocialMediaDetails(SocialMediaTeamMapping socialMedia) {
		SocialMediaDetailsBean socialMediaDetails = new SocialMediaDetailsBean();
		if(socialMedia != null) {
			socialMediaDetails.setPlatform(String.valueOf(socialMedia.getSocialMedia().getSocialMediaPlatform()));
			socialMediaDetails.setLink(socialMedia.getLink());
			socialMediaDetails.setFollowers(socialMedia.getFollowers());
		}
		
		return socialMediaDetails;
	}
}
