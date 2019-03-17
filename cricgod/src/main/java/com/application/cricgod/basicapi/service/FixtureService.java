package com.application.cricgod.basicapi.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface FixtureService {

	CustomJsonUtil getAllFixturesByYear(int year);
	CustomJsonUtil getFixtureById(int fixture_id);
}
