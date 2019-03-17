package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.Fixture;
import com.application.cricgod.entity.Player;
import com.application.cricgod.entity.SocialMediaTeamMapping;
import com.application.cricgod.entity.Stadium;
import com.application.cricgod.entity.Team;
import com.application.cricgod.repository.FixtureRepository;
import com.application.cricgod.repository.HomeGroundRepository;
import com.application.cricgod.repository.PlayerTeamRepository;
import com.application.cricgod.repository.SocialMediaTeamRepositroy;
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
	private FixtureRepository fixtureRepository;
	
	@Autowired
	private HomeGroundRepository homeGroundRepository;
	
	@Autowired
	private SocialMediaTeamRepositroy socialMediaTeamRepositroy;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	
	@Override
	public CustomJsonUtil getAllTeams() {
		List<Team> teams = teamRepository.findAll();
		if(teams != null) {
			customJsonResponse.setParams(teams, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getTeamById(int team_id) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			customJsonResponse.setParams(teamInfo, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getSquadByYear(int team_id, int year) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			List<Player> squad = playerTeamRepository.getSquadByYear(team_id, year);
			if(squad != null) {
				customJsonResponse.setParams(squad, "RESP_SUCCESS");
			}
			else {
				customJsonResponse.setParams(null, "RESP_FAILURE_TEAM_SQUAD");
			}
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getFixturesByTeam(int team_id, int year) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			List<Fixture> fixtures = fixtureRepository.getAllFixturesByTeam(team_id, year);
			if(fixtures != null) {
				customJsonResponse.setParams(fixtures, "RESP_SUCCESS");
			}
			else {
				customJsonResponse.setParams(null, "RESP_FAILURE_TEAM_FIXTURES");
			}
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getHomeGroundByYear(int team_id, int year) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			List<Stadium> homeground = homeGroundRepository.getHomeGroundByYear(team_id, year);
			if (homeground != null) {
				customJsonResponse.setParams(homeground, "RESP_SUCCESS");
			}
			else {
				customJsonResponse.setParams(null, "RESP_FAILURE_TEAM_HOMEGROUND");
			}
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
				
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getSocialMediaByTeam(int team_id) {
		Team teamInfo = teamRepository.getTeamById(team_id);
		if(teamInfo != null) {
			List<SocialMediaTeamMapping> socialMedia = socialMediaTeamRepositroy.getSocialMediaByTeam(team_id);
			if(socialMedia != null) {
				customJsonResponse.setParams(socialMedia, "RESP_SUCCESS");
			}
			else {
				customJsonResponse.setParams(null, "RESP_FAILURE_SOCIALMEDIA_TEAM");
			}
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	
}
