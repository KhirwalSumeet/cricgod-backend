package com.application.cricgod.basicapi.beans;


/**
 * Bean class about complete information of the player in which team he belonged in a particular year
 */
public class PlayerTeamBean {
	
	/** Id */
	private int id;
	
	/** Details of the player belonged to which team in which year */
	private PlayerTeamDetailsBean playerTeamDetails;

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
	 * @return the playerTeamDetails
	 */
	public PlayerTeamDetailsBean getPlayerTeamDetails() {
		return playerTeamDetails;
	}

	/**
	 * @param playerTeamDetails the playerTeamDetails to set
	 */
	public void setPlayerTeamDetails(PlayerTeamDetailsBean playerTeamDetails) {
		this.playerTeamDetails = playerTeamDetails;
	}
	
}
