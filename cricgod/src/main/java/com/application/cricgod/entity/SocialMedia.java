package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.application.cricgod.enums.SocialMediaPlatformEnum;


@Entity
@Table(name="social_media")
public class SocialMedia {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="platform", nullable=false)
	@Enumerated(EnumType.STRING)
	private SocialMediaPlatformEnum socialMediaPlatform;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SocialMediaPlatformEnum getSocialMediaPlatform() {
		return socialMediaPlatform;
	}

	public void setSocialMediaPlatform(SocialMediaPlatformEnum socialMediaPlatform) {
		this.socialMediaPlatform = socialMediaPlatform;
	}
	
}
