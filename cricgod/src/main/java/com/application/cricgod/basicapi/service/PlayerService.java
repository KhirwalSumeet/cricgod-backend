package com.application.cricgod.basicapi.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface PlayerService {
	
	CustomJsonUtil getAllPlayers();
	CustomJsonUtil getPlayer(int player_id);
	CustomJsonUtil getTeamByPlayerAndYear(int player_id, int year);
}
