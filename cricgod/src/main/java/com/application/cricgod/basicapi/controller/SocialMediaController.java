package com.application.cricgod.basicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.basicapi.service.SocialMediaService;
import com.application.cricgod.util.CustomJsonUtil;



@RestController
public class SocialMediaController {
	
	@Autowired
	private SocialMediaService socialMediaService;
	
	@RequestMapping(method = RequestMethod.GET, value="/social_media/all")
	public CustomJsonUtil getAllSocialMedia() {
		return socialMediaService.getAllSocialMedia();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/social_media/{social_media_id}")
	public CustomJsonUtil getSocialMediaById(@PathVariable("social_media_id") String social_media_id) {
		return socialMediaService.getSocialMediaById(Integer.parseInt(social_media_id));
	}
	
}
