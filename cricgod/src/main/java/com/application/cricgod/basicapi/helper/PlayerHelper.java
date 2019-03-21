package com.application.cricgod.basicapi.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.cricgod.basicapi.beans.PlayerDetailsBean;
import com.application.cricgod.entity.Player;


/**
 * This is a player related helper class
 */
@Component
public class PlayerHelper {
	
	/**
	 * This method maps list of Player Entities to list of PlayerDetails Beans
	 * @param players : List of Player entities 
	 * 
	 * @return List of PlayerDetails Bean objects
	 */
	public List<PlayerDetailsBean> mapPlayersDetails(List<Player> players) {
		List<PlayerDetailsBean> playersDetails =  new ArrayList<PlayerDetailsBean>();
		for(Player player : players) {
			playersDetails.add(mapPlayerDetails(player));
		}
		
		return playersDetails;
	}
	
	
	/**
	 * This method maps Player Entity to PlayerDetails Bean
	 * @param player : Player entity object
	 * 
	 * @return Object of PlayerDetails Bean
	 */
	public PlayerDetailsBean mapPlayerDetails(Player player) {
		PlayerDetailsBean playerDetails =  new PlayerDetailsBean();
		if(player != null){
			playerDetails.setName(player.getName());
			playerDetails.setBattingStyle(player.getBattingStyle().name());
			playerDetails.setBowlingStyle(player.getBowlingStyle().name());
			playerDetails.setRole(player.getRole().name());
			playerDetails.setDob(player.getDob());
			playerDetails.setNationality(player.getNationality());
		}
		
		return playerDetails;
	}
}
