package com.application.cricgod.basicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.basicapi.beans.TeamDetailsRequestBean;
import com.application.cricgod.basicapi.beans.TeamRequestFlagsBean;
import com.application.cricgod.basicapi.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;


@RestController
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	
	/**
	 * Retrieves specified details of the team of a particular year
	 * @param request : Request bean containing all the flags of required team details and year
	 * 
	 * @return CustomJsonUtil : Custom json response of requested details of a all teams in the given year
	 */
	@RequestMapping(method=RequestMethod.POST, value="/team/all")
	public CustomJsonUtil getAllTeamDetails(@RequestBody TeamDetailsRequestBean request) {
		TeamRequestFlagsBean teamRequestFlags = setTeamRequestFlags(request);
		int year = Integer.parseInt(request.getYear());
		
		return teamService.getAllTeamDetails(teamRequestFlags, year);
	}
	
	
	/**
	 * Retrieves specified details of the team of a particular year
	 * @param team_id : Id of the team to be fetched
	 * @param request : Request bean containing all the flags of required team details and year
	 * 
	 * @return CustomJsonUtil : Custom json response of requested details of a particular team in the given year
	 */
	@RequestMapping(method=RequestMethod.POST, value="/team/{team_id}")
	public CustomJsonUtil getTeamDetails(@PathVariable("team_id") int team_id, @RequestBody TeamDetailsRequestBean request) {
		TeamRequestFlagsBean teamRequestFlags = setTeamRequestFlags(request);
		int year = Integer.parseInt(request.getYear());
		
		return teamService.getTeamDetails(team_id, teamRequestFlags, year);
	}
	
	
	/**
	 * This method sets all the flags from request body to TeamRequestFlagsBean
	 * @param teamDetailsRequest : Contains all the flags of required team details
	 * 
	 * @return TeamRequestFlagsBean : Set of boolean flags of required team details
	 */
	public TeamRequestFlagsBean setTeamRequestFlags(TeamDetailsRequestBean teamDetailsRequest) {
		TeamRequestFlagsBean teamRequestFlags = new TeamRequestFlagsBean();
		
		teamRequestFlags.setTeamNameFlag(Boolean.valueOf(teamDetailsRequest.getTeamNameFlag()));
		teamRequestFlags.setSquadDetailsFlag(Boolean.valueOf(teamDetailsRequest.getSquadDetailsFlag()));
		teamRequestFlags.setFixtureDetailsFlag(Boolean.valueOf(teamDetailsRequest.getFixtureDetailsFlag()));
		teamRequestFlags.setSocialMediaDetailsFlag(Boolean.valueOf(teamDetailsRequest.getSocialMediaDetailsFlag()));
		teamRequestFlags.setHomeGroundDetailsFlag(Boolean.valueOf(teamDetailsRequest.getHomeGroundDetailsFlag()));
		teamRequestFlags.setOwnerDetailsFlag(Boolean.valueOf(teamDetailsRequest.getOwnerDetailsFlag()));
		
		return teamRequestFlags;
	}
	
		
}
