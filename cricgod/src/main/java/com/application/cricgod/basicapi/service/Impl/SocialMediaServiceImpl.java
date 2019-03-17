package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.basicapi.service.SocialMediaService;
import com.application.cricgod.entity.SocialMedia;
import com.application.cricgod.repository.SocialMediaRepository;
import com.application.cricgod.util.CustomJsonUtil;

@Service
public class SocialMediaServiceImpl implements SocialMediaService {
	
	@Autowired
	private SocialMediaRepository socialMediaRepository;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	
	@Override
	public CustomJsonUtil getAllSocialMedia() {
		List<SocialMedia> socialMedia = socialMediaRepository.findAll();
		if(socialMedia != null) customJsonResponse.setParams(socialMedia, "RESP_SUCCESS");
		
		return customJsonResponse;
	}

	@Override
	public CustomJsonUtil getSocialMediaById(int social_media_id) {
		SocialMedia socialMedia = socialMediaRepository.getSocialMediaById(social_media_id);
		if(socialMedia != null) customJsonResponse.setParams(socialMedia, "RESP_SUCCESS");
		else customJsonResponse.setParams(null, "RESP_FAILURE_SOCIALMEDIA");
		
		return customJsonResponse;
	}
	
}
