package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Stadium;


public interface StadiumRepository extends JpaRepository<Stadium, Integer>{
	
	@Query("Select stadium from Stadium stadium where stadium.id=?1")
	Stadium getStadiumById(int id);
	
}
