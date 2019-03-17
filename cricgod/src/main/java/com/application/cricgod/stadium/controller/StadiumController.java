package com.application.cricgod.stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.cricgod.stadium.service.StadiumService;
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
	public CustomJsonUtil getPlayer(@PathVariable("stadium_id") String stadium_id) {
		return stadiumService.getStadium(Integer.parseInt(stadium_id));
	}
	

}
