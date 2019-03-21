package com.application.cricgod.basicapi.service.Impl;

import java.util.ArrayList;
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
import com.application.cricgod.repository.SocialMediaTeamRepository;
import com.application.cricgod.repository.TeamRepository;
import com.application.cricgod.basicapi.beans.TeamDetailsBean;
import com.application.cricgod.basicapi.beans.TeamRequestFlagsBean;
import com.application.cricgod.basicapi.helper.TeamHelper;
import com.application.cricgod.basicapi.service.TeamService;
import com.application.cricgod.util.CustomJsonUtil;


/**
 * This is implementation for Team related APIs service interface
 */
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
	private SocialMediaTeamRepository socialMediaTeamRepository;
	
	@Autowired 
	private TeamHelper teamHelper;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	
	/**
	 * Retrieves specified details of the team of a particular year
	 * @teamDetailsFlags : Flags of different team details mentioning whether they are needed or not
	 * @year : Year to be searched in
	 * 
	 * return CustomJsonUtil : Custom json response of requested details of a all teams in the given year
	 */
	@Override
	public CustomJsonUtil getAllTeamDetails(TeamRequestFlagsBean teamDetailsFlags, int year) {
		
		List<Team> teams = teamRepository.findAll();
		List<TeamDetailsBean> allTeamDetails = new ArrayList<TeamDetailsBean>();
		for(Team team : teams) {
			if(team != null) {
				TeamDetailsBean teamDetails = getParticularTeamDetails(team, teamDetailsFlags, year);
				allTeamDetails.add(teamDetails);
			}
		}
		customJsonResponse.setParams(allTeamDetails, "RESP_SUCCESS");
		return customJsonResponse;	
	}
	
	
	/**
	 * Retrieves specified details of the team of a particular year
	 * @team_id : Id of the team
	 * @teamDetailsFlags : Flags of different team details mentioning whether they are needed or not
	 * @year : Year to be searched in
	 * 
	 * return CustomJsonUtil : Custom json response of requested details of a particular team in the given year
	 */
	@Override
	public CustomJsonUtil getTeamDetails(int team_id, TeamRequestFlagsBean teamDetailsFlags, int year) {
		
		Team team = teamRepository.getTeamById(team_id);
		
		if(team != null) {
			TeamDetailsBean teamDetails = getParticularTeamDetails(team, teamDetailsFlags, year);
			customJsonResponse.setParams(teamDetails, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_TEAM");
		}
		
		return customJsonResponse;
	}
	
	
	/**
	 * Retrieves specified details of the team of a particular year
	 * @team : Entity of the team
	 * @teamDetailsFlags : Flags of different team details mentioning whether they are needed or not
	 * @year : Year to be searched in
	 * 
	 * return TeamDetailsBean : Requested details of a particular team in the given year
	 */
	public TeamDetailsBean getParticularTeamDetails(Team team, TeamRequestFlagsBean teamDetailsFlags, int year) {
		
		int team_id = team.getId();
		List<Player> squad = null;
		List<Fixture> fixtures = null;
		List<SocialMediaTeamMapping> socialMedias = null;
		Stadium homeGround = null;
		String owner = null;
		
		if(!teamDetailsFlags.isTeamNameFlag()){
			team = null;
		}
		if(teamDetailsFlags.isSquadDetailsFlag()) {
			squad = playerTeamRepository.getSquadByYear(team_id, year);
		}
		if(teamDetailsFlags.isFixtureDetailsFlag()) {
			fixtures = fixtureRepository.getAllFixturesByTeam(team_id, year);
		}
		if(teamDetailsFlags.isSocialMediaDetailsFlag()) {
			socialMedias = socialMediaTeamRepository.getSocialMediaByTeam(team_id);
		}
		if(teamDetailsFlags.isHomeGroundDetailsFlag()) {
			homeGround = homeGroundRepository.getHomeGroundByYear(team_id, year);
		}
		if(teamDetailsFlags.isOwnerDetailsFlag()) {
			owner = "VVS Laxman";
		}
		
		return teamHelper.mapTeamDetails(team, squad, fixtures, socialMedias, homeGround, owner);		
	}
	
	
}
