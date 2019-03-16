package com.application.cricgod.players.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.players.service.PlayerService;
import com.application.cricgod.util.CustomJsonUtil;


@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(method=RequestMethod.GET, value="/player/all")
	public CustomJsonUtil getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/player/{player_id}")
	public CustomJsonUtil getPlayer(@PathVariable("player_id") String player_id) {
		return playerService.getPlayer(Integer.parseInt(player_id));
	}
	
}
