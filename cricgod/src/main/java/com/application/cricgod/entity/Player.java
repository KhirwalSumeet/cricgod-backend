package com.application.cricgod.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.application.cricgod.enums.BatStyleEnum;
import com.application.cricgod.enums.BowlStyleEnum;
import com.application.cricgod.enums.RoleEnum;


@Entity
@Table(name="player")
public class Player {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="batting_style", nullable = false)
	@Enumerated(EnumType.STRING)
	private BatStyleEnum battingStyle;
	
	@Column(name="bowling_style", nullable = false)
	@Enumerated(EnumType.STRING)
	private BowlStyleEnum bowlingStyle;
	
	@Column(name="role", nullable = false)
	@Enumerated(EnumType.STRING)
	private RoleEnum role;
	
	@Column(name="dob", nullable = false)
	private LocalDate dob;
	
	@Column(name = "nationality", nullable = false)
	private String nationality;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BatStyleEnum getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(BatStyleEnum battingStyle) {
		this.battingStyle = battingStyle;
	}

	public BowlStyleEnum getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(BowlStyleEnum bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
