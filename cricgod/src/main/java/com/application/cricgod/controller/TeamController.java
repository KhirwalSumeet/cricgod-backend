package com.application.cricgod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.entity.Team;
import com.application.cricgod.repository.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping("/teams/all")
	public List<Team> retrieveTeams() {
		return teamRepository.findAll();
	}
}

