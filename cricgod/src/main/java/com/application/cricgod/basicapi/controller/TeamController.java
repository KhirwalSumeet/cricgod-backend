package com.application.cricgod.basicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.basicapi.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;


@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/team/all")
	public CustomJsonUtil getAllTeams() {
		return teamService.getAllTeams();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/team/{team_id}")
	public CustomJsonUtil getTeam(@PathVariable("team_id") String team_id) {
		return teamService.getTeamById(Integer.parseInt(team_id));
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/team/{team_id}/squad")
	public CustomJsonUtil getSquadByYear(@PathVariable("team_id") String team_id, @RequestParam("year") String year) {
		return teamService.getSquadByYear(Integer.parseInt(team_id), Integer.parseInt(year));
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/team/{team_id}/fixtures")
	public CustomJsonUtil getFixturesByTeam(@PathVariable("team_id") String team_id, @RequestParam("year") String year) {
		return teamService.getFixturesByTeam(Integer.parseInt(team_id), Integer.parseInt(year));
	}
	
}
