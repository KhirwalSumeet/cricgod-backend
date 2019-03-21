package com.application.cricgod.basicapi.service;

import com.application.cricgod.basicapi.beans.TeamRequestFlagsBean;
import com.application.cricgod.util.CustomJsonUtil;


/**
 * This is interface for Team related APIs service class
 */
public interface TeamService {
	
	CustomJsonUtil getAllTeamDetails(TeamRequestFlagsBean teamDetailsFlags, int year);
	
	CustomJsonUtil getTeamDetails(int team_id, TeamRequestFlagsBean teamDetailsFlags, int year);
			
}
