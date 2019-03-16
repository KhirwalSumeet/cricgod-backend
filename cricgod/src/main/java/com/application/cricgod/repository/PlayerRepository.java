package com.application.cricgod.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Player;


public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	@Query("Select player from Player player where player.id=?1")
	Player getPlayerById(int id);
	
}
