package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Team;


public interface TeamRepository extends JpaRepository<Team, Integer> {
	
	@Query("Select team from Team team where team.id=?1")
	Team getTeamById(int id);
	
}
