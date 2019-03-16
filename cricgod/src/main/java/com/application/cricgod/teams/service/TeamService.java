package com.application.cricgod.teams.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface TeamService {
	
	CustomJsonUtil retrieveAllTeams();
	CustomJsonUtil retrieveTeam(int team_id);
}
