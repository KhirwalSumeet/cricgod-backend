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
	private SocialMediaPlatformEnum sm_platform;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SocialMediaPlatformEnum getPlatform() {
		return sm_platform;
	}

	public void setPlatform(SocialMediaPlatformEnum sm_platform) {
		this.sm_platform = sm_platform;
	}
	
}
