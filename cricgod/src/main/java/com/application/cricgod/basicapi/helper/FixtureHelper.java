package com.application.cricgod.basicapi.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.cricgod.basicapi.beans.FixtureDetailsBean;
import com.application.cricgod.entity.Fixture;


/**
 * This is a fixtures related helper class
 */
@Component
public class FixtureHelper {
	
	/** Object of Team Helper class */
	@Autowired
	private TeamHelper teamHelper;
	
	/** Object of Stadium Helper class */
	@Autowired
	private StadiumHelper stadiumHelper;
	
	
	/**
	 * This method maps list of Fixture Entities to list of FixtureDetails Beans
	 * @param players : List of Fixture entities 
	 * 
	 * @return List of FixtureDetails Bean objects
	 */
	public List<FixtureDetailsBean> mapFixturesDetails(List<Fixture> fixtures) {
		List<FixtureDetailsBean> fixturesDetails = new ArrayList<FixtureDetailsBean>();
		for(Fixture fixture : fixtures) {
			fixturesDetails.add(mapFixtureDetails(fixture));
		}
		
		return fixturesDetails;
	}
	
	
	/**
	 * This method maps Fixture Entity to FixtureDetails Bean
	 * @param player : Fixture entity object
	 * 
	 * @return Object of FixtureDetails Bean
	 */
	public FixtureDetailsBean mapFixtureDetails(Fixture fixture) {
		FixtureDetailsBean fixtureDetails = new FixtureDetailsBean();
		if(fixture != null) {
			fixtureDetails.setYear(fixture.getYear());
			fixtureDetails.setFixtureDateAndTime(fixture.getDateTime());
			fixtureDetails.setStadiumDetails(stadiumHelper.mapStadiumDetails(fixture.getStadium()));
			fixtureDetails.setTeam1(teamHelper.mapTeamNameDetails(fixture.getTeam1()));
			fixtureDetails.setTeam2(teamHelper.mapTeamNameDetails(fixture.getTeam2()));
		}
		
		return fixtureDetails;
	}
}
