package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.Player;
import com.application.cricgod.entity.Team;
import com.application.cricgod.repository.PlayerTeamRepository;
import com.application.cricgod.repository.TeamRepository;
import com.application.cricgod.basicapi.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private PlayerTeamRepository playerTeamRepository;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	@Override
	public CustomJsonUtil getAllTeams() {
		List<Team> teams = teamRepository.findAll();
		if(teams != null) customJsonResponse.setParams(teams, "RESP_SUCCESS");
		
		return customJsonResponse;
	}

	@Override
	public CustomJsonUtil getTeamById(int team_id) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) customJsonResponse.setParams(teamInfo, "RESP_SUCCESS");
		else customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		
		return customJsonResponse;
	}
	
	@Override
	public CustomJsonUtil getSquadByYear(int team_id, int year) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			List<Player> squad = playerTeamRepository.getSquadByYear(team_id, year);
			System.out.println(squad);
			if(squad != null) customJsonResponse.setParams(squad, "RESP_SUCCESS");
		}
		else customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		
		return customJsonResponse;
	}
	
	
}
