package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.SocialMediaTeamMapping;

public interface SocialMediaTeamRepositroy extends JpaRepository<SocialMediaTeamMapping, Integer> {
	
	@Query("select map from SocialMediaTeamMapping map where map.team.id=?1")
	List<SocialMediaTeamMapping> getSocialMediaByTeam(int tem_id);
}
