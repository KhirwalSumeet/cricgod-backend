package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Innings;

public interface InningsRepository extends JpaRepository<Innings, Integer> {
	
	@Query("select innings from Innings innings where innings.id=?1")
	public List<Innings> getInningsById(int id);

}
