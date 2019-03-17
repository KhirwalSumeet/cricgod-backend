package com.application.cricgod.stadium.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface StadiumService {
	CustomJsonUtil getAllStadiums();
	CustomJsonUtil getStadiumById(int stadium_id);

}
