package com.application.cricgod.basicapi.beans;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Bean class for details of the player
 *
 */
@JsonInclude(Include.NON_NULL)
public class PlayerDetailsBean {
	
	/** Name of the player */
	private String name;
	
	/** Batting hand of the player */
	private String battingStyle;
	
	/** Bowling hand and type of the player */
	private String bowlingStyle;
	
	/** Role of player */
	private String role;
	
	/** Date of Birth of player */
	private LocalDate dob;
	
	/** Nationality of the player */
	private String nationality;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the battingStyle
	 */
	public String getBattingStyle() {
		return battingStyle;
	}

	/**
	 * @param battingStyle the battingStyle to set
	 */
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	/**
	 * @return the bowlingStyle
	 */
	public String getBowlingStyle() {
		return bowlingStyle;
	}

	/**
	 * @param bowlingStyle the bowlingStyle to set
	 */
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
