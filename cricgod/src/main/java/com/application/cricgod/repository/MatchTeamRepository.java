package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.MatchTeamMapping;

public interface MatchTeamRepository extends JpaRepository<MatchTeamMapping, Integer> {

}
