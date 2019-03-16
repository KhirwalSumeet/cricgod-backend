package com.application.cricgod.teams.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.Team;
import com.application.cricgod.repository.TeamRepository;
import com.application.cricgod.teams.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private CustomJsonUtil customJson;
	
	@Override
	public CustomJsonUtil retrieveAllTeams() {
		List<Team> teams = teamRepository.findAll();
		if(teams != null) customJson.setParams(teams, "RESP_SUCCESS");
		return customJson;
	}

	@Override
	public CustomJsonUtil retrieveTeam(int team_id) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) customJson.setParams(teamInfo, "RESP_SUCCESS");
		else customJson.setParams(null, "RESP_TEAM_FAILURE");
		return customJson;
	}
}
