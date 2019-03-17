package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Toss;

public interface TossRepository extends JpaRepository<Toss, Integer> {
	
	@Query("select toss from Toss toss where toss.id=?1")
	public List<Toss> getTossById(int id);
	
}
