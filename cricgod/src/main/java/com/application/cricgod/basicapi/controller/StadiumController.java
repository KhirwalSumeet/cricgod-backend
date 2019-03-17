package com.application.cricgod.basicapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.basicapi.service.StadiumService;
import com.application.cricgod.util.CustomJsonUtil;

@RestController
public class StadiumController {
	
	@Autowired
    private StadiumService stadiumService;
	
	@RequestMapping(method=RequestMethod.GET, value="/stadium/all")
	public CustomJsonUtil getAllStadiums() {
		return stadiumService.getAllStadiums();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/stadium/{stadium_id}")
	public CustomJsonUtil getStadium(@PathVariable("stadium_id") String stadium_id) {
		return stadiumService.getStadiumById(Integer.parseInt(stadium_id));
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/stadium/all/homeground")
	public CustomJsonUtil getAllHomeGroundsByYear(@RequestParam("year") String year) {
		return stadiumService.getAllHomeGroundsByYear(Integer.parseInt(year));
	}
	
	

}
