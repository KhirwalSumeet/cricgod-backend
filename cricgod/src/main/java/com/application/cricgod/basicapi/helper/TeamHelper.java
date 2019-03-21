package com.application.cricgod.basicapi.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.cricgod.basicapi.beans.TeamDetailsBean;
import com.application.cricgod.basicapi.beans.TeamNameDetailsBean;
import com.application.cricgod.entity.Fixture;
import com.application.cricgod.entity.Player;
import com.application.cricgod.entity.SocialMediaTeamMapping;
import com.application.cricgod.entity.Stadium;
import com.application.cricgod.entity.Team;


/**
 * This is a team related helper class
 */
@Component
public class TeamHelper {
	
	/** Object of Player Helper class */
	@Autowired
	private PlayerHelper playerHelper;
	
	/** Object of Fixture Helper class */
	@Autowired
	private FixtureHelper fixtureHelper;
	
	/** Object of Social-Media Helper class */
	@Autowired
	private SocialMediaHelper socialMediaHelper;
	
	/** Object of Stadium Helper class */
	@Autowired
	private StadiumHelper stadiumHelper;
	
	
	/**
	 * This method maps Team Entity to TeamNameDetails Bean
	 * @param team : Team entity object
	 * 
	 * @return Object of TeamNameDetails Bean
	 */
	public TeamNameDetailsBean mapTeamNameDetails(Team team) {
		TeamNameDetailsBean teamNameDetails = new TeamNameDetailsBean();
		if(team != null) {
			teamNameDetails.setFullName(team.getName());
			teamNameDetails.setAbbreviation(team.getAbbreviation());
		}
		
		return teamNameDetails;
	}
	
	
	/**
	 * This method maps all the team related entities to respective beans in TeamDetailsBean
	 * @param team : Object of Team entity
	 * @param squad : Squad of the team
	 * @param fixtures : Fixyures of the team
	 * @param socialMedias : List of all Social media of the team
	 * @param owner : Owner of the team
	 * 
	 * @return : Mapped TeamDetailsBean
	 */
	public TeamDetailsBean mapTeamDetails(Team team, List<Player> squad, List<Fixture> fixtures, 
			List<SocialMediaTeamMapping> socialMedias, Stadium homeGround, String owner) {
		
		TeamDetailsBean teamDetails = new TeamDetailsBean();
		
		if(team != null) {
			teamDetails.setTeamNameDetails(mapTeamNameDetails(team));
		}
		if(squad != null) {
			teamDetails.setSquadDetails(playerHelper.mapPlayersDetails(squad));
		}
		if(fixtures != null) {
			teamDetails.setFixtureDetails(fixtureHelper.mapFixturesDetails(fixtures));
		}
		if(socialMedias != null) {
			teamDetails.setSocialMediaDetails(socialMediaHelper.mapSocialMediasDetails(socialMedias));
		}
		if(homeGround != null) {
			teamDetails.setHomeGroundDetails(stadiumHelper.mapStadiumDetails(homeGround));
		}
		if(owner != null) {
			teamDetails.setOwner(owner);
		}
		
		return teamDetails;
	}
	
}
