package com.application.cricgod.stadium.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface StadiumService {
	CustomJsonUtil getAllStadiums();
	CustomJsonUtil getStadium(int stadium_id);

}
