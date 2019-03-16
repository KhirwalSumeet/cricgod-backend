package com.application.cricgod.teams.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface TeamService {
	
	CustomJsonUtil getAllTeams();
	CustomJsonUtil getTeamById(int team_id);
	CustomJsonUtil getSquadByYear(int team_id, int year);
}
