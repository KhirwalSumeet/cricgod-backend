package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete information of a player
 *
 */
@JsonInclude(Include.NON_NULL)
public class PlayerBean {
	
	/** Id of a player */
	private int id;
	
	/** Details of a player */
	private PlayerDetailsBean playerDetails;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the playerDetails
	 */
	public PlayerDetailsBean getPlayerDetails() {
		return playerDetails;
	}

	/**
	 * @param playerDetails the playerDetails to set
	 */
	public void setPlayerDetails(PlayerDetailsBean playerDetails) {
		this.playerDetails = playerDetails;
	}
	
}
