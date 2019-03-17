package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Player;
import com.application.cricgod.entity.PlayerTeamMapping;
import com.application.cricgod.entity.Team;


public interface PlayerTeamRepository extends JpaRepository<PlayerTeamMapping, Integer> {
	
	@Query("select map.player from PlayerTeamMapping map where map.team.id=?1 and map.year=?2")
	List<Player> getSquadByYear(int team_id, int year);
	
	@Query("select map.team from PlayerTeamMapping map where map.player.id=?1 and map.year=?2")
	Team getTeamByPlayerAndYear(int player_id, int year);
	
}
