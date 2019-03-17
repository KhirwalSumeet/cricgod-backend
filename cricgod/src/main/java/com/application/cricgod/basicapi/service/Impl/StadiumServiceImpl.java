package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.entity.HomeGroundMapping;
import com.application.cricgod.entity.Stadium;
import com.application.cricgod.repository.HomeGroundRepository;
import com.application.cricgod.repository.StadiumRepository;
import com.application.cricgod.basicapi.service.StadiumService;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class StadiumServiceImpl implements StadiumService {
	
	@Autowired
	private StadiumRepository stadiumRepository;
	
	@Autowired
	private HomeGroundRepository homeGroundRepository;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	
	@Override
	public CustomJsonUtil getAllStadiums() {
		List<Stadium> stadiums = stadiumRepository.findAll();
		if(stadiums != null) {
			customJsonResponse.setParams(stadiums, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_STADIUM");
		}
		
		return customJsonResponse;
	}
	
	
	@Override
	public CustomJsonUtil getStadiumById(int stadium_id) {
		Stadium stadium = stadiumRepository.getStadiumById(stadium_id);
		if(stadium != null) {
			customJsonResponse.setParams(stadium, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_STADIUM");
		}
		
		return customJsonResponse;
	}
	

	@Override
	public CustomJsonUtil getAllHomeGroundsByYear(int year) {
		List<HomeGroundMapping> homeground = homeGroundRepository.getAllHomeGroundsByYear(year);		
		if(homeground != null) {
			customJsonResponse.setParams(homeground, "RESP_SUCCESS");
		}
		else {
			customJsonResponse.setParams(null, "RESP_FAILURE_STADIUM_YEAR");
		}
		
		return customJsonResponse;
	}
	
	
}
