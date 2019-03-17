package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
	
}
