package com.application.cricgod.players.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.Player;
import com.application.cricgod.players.service.PlayerService;
import com.application.cricgod.repository.PlayerRepository;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	@Override
	public CustomJsonUtil getAllPlayers() {
		List<Player> players = playerRepository.findAll();
		if(players != null) customJsonResponse.setParams(players, "RESP_SUCCESS");
		
		return customJsonResponse;
	}

	@Override
	public CustomJsonUtil getPlayer(int player_id) {
		Player player = playerRepository.getPlayerById(player_id);
		if(player != null) customJsonResponse.setParams(player, "RESP_SUCCESS");
		else customJsonResponse.setParams(null, "RESP_FAILURE_PLAYER");
		
		return customJsonResponse;
	}

}
