package com.application.cricgod.teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.teams.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;

@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/team/all")
	public CustomJsonUtil retrieveAllTeams() {
		return teamService.retrieveAllTeams();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/team/{team_id}")
	public CustomJsonUtil retrieveTeam(@PathVariable("team_id") String team_id) {
		return teamService.retrieveTeam(Integer.parseInt(team_id));
	}
	
}
