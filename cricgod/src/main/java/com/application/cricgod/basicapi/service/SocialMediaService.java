package com.application.cricgod.basicapi.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface SocialMediaService {
	
	CustomJsonUtil getAllSocialMedia();
	
	CustomJsonUtil getSocialMediaById(int social_media_id);
	
}
