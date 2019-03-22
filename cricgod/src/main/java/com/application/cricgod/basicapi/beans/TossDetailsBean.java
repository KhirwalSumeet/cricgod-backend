package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean class for complete information of the fixture
 *
 */
@JsonInclude(Include.NON_NULL)
public class TossDetailsBean {
	
	/** Toss Caller Details */
	private PlayerDetailsBean callerDetails;
	
	/** Toss Winner Details */
	private PlayerDetailsBean winnerDetails;
	
	/** Decision taken by Winner after winning toss*/
	private String tossDescision;

	/**
	 * @return the callerDetails
	 */
	public PlayerDetailsBean getCallerDetails() {
		return callerDetails;
	}

	/**
	 * @param callerDetails the callerDetails to set
	 */
	public void setCallerDetails(PlayerDetailsBean callerDetails) {
		this.callerDetails = callerDetails;
	}

	/**
	 * @return the winnerDetails
	 */
	public PlayerDetailsBean getWinnerDetails() {
		return winnerDetails;
	}

	/**
	 * @param winnerDetails the winnerDetails to set
	 */
	public void setWinnerDetails(PlayerDetailsBean winnerDetails) {
		this.winnerDetails = winnerDetails;
	}

	/**
	 * @return the tossDescision
	 */
	public String getTossDescision() {
		return tossDescision;
	}

	/**
	 * @param tossDescision the tossDescision to set
	 */
	public void setTossDescision(String tossDescision) {
		this.tossDescision = tossDescision;
	}
	
}
