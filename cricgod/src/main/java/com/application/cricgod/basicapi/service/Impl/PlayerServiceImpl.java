package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.Player;
import com.application.cricgod.entity.PlayerTeamMapping;
import com.application.cricgod.entity.Team;
import com.application.cricgod.basicapi.service.PlayerService;
import com.application.cricgod.repository.PlayerRepository;
import com.application.cricgod.repository.PlayerTeamRepository;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private PlayerTeamRepository playerTeamRepository;
	
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

	@Override
	public CustomJsonUtil getTeamByPlayerAndYear(int player_id, int year) {
		if(playerRepository.getPlayerById(player_id) != null) {
			Team teamInfo = playerTeamRepository.getTeamByPlayerAndYear(player_id, year);
			if(teamInfo != null) customJsonResponse.setParams(teamInfo, "RESP_SUCCESS");
			else customJsonResponse.setParams(null, "RESP_FAILURE_PLAYER_TEAM");
		}
		else customJsonResponse.setParams(null, "RESP_FAILURE_PLAYER");
		
		return customJsonResponse;
	}
	
	
}
