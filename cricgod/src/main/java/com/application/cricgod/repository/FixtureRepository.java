package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Fixture;


public interface FixtureRepository extends JpaRepository<Fixture, Integer> {
	
	@Query("select fixture from Fixture fixture where fixture.year=?1")
	public List<Fixture> getAllFixturesByYear(int year);
	
	@Query("select fixture from Fixture fixture where fixture.id=?1")
	public Fixture getFixtureById(int fixture_id);
	
	@Query("select fixture from Fixture fixture where (fixture.team1.id=?1 or fixture.team2.id=?1) and fixture.year=?2")
	public List<Fixture> getAllFixturesByTeam(int team_id, int year);
	
	
}
