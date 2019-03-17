package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.HomeGroundMapping;
import com.application.cricgod.entity.Stadium;


public interface HomeGroundRepository extends JpaRepository<HomeGroundMapping, Integer>{
	
	@Query("select map.stadium from HomeGroundMapping map where map.team.id=?1 and map.year=?2")
	List<Stadium> getHomeGroundByYear(int team_id, int year);
	
	@Query("select map.stadium, map.team from HomeGroundMapping map where map.year=?1")
	List<HomeGroundMapping> getAllHomeGroundsByYear(int year);

}
