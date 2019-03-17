package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.SocialMedia;


public interface SocialMediaRepository extends JpaRepository<SocialMedia, Integer> {
	
	@Query("select social_media from SocialMedia social_media where social_media.id=?1")
	SocialMedia getSocialMediaById(int social_media_id);
	
}
