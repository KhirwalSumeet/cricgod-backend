package com.application.cricgod.basicapi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.cricgod.basicapi.service.FixtureService;
import com.application.cricgod.entity.Fixture;
import com.application.cricgod.repository.FixtureRepository;
import com.application.cricgod.util.CustomJsonUtil;


@Service
public class FixtureServiceImpl implements FixtureService {
	
	@Autowired
	private FixtureRepository fixtureRepository;
	
	@Autowired
	private CustomJsonUtil customJsonResponse;
	
	@Override
	public CustomJsonUtil getAllFixturesByYear(int year) {
		List<Fixture> fixtures = fixtureRepository.getAllFixturesByYear(year);
		if(fixtures != null) customJsonResponse.setParams(fixtures, "RESP_SUCCESS");
		return customJsonResponse;
	}

	@Override
	public CustomJsonUtil getFixtureById(int fixture_id) {
		Fixture fixture = fixtureRepository.getFixtureById(fixture_id);
		if(fixture != null) customJsonResponse.setParams(fixture, "RESP_SUCCESS");
		else customJsonResponse.setParams(null, "RESP_FAILURE_FIXTURE");
		
		return customJsonResponse;
	}
	
	
}
