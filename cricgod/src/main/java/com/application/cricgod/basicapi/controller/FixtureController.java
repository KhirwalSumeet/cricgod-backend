package com.application.cricgod.basicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.basicapi.service.FixtureService;
import com.application.cricgod.util.CustomJsonUtil;

@RestController
public class FixtureController {
	
	@Autowired
	private FixtureService fixtureService;
	
	@RequestMapping(method = RequestMethod.GET, value="/fixture/all")
	public CustomJsonUtil getAllFixturesByYear(@RequestParam("year") String year) {
		return fixtureService.getAllFixturesByYear(Integer.parseInt(year));
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/fixture/{fixture_id}")
	public CustomJsonUtil getFixtureById(@PathVariable("fixture_id") String fixture_id) {
		return fixtureService.getFixtureById(Integer.parseInt(fixture_id));
	}
	
}
