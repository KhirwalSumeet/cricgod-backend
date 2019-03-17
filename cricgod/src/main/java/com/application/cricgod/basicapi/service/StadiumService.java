package com.application.cricgod.basicapi.service;

import com.application.cricgod.util.CustomJsonUtil;

public interface StadiumService {
	CustomJsonUtil getAllStadiums();
	CustomJsonUtil getStadiumById(int stadium_id);

}
