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
	
	@Column(name="batting_style")
	@Enumerated(EnumType.STRING)
	private BatStyleEnum batting_style;
	
	@Column(name="bowling_style")
	@Enumerated(EnumType.STRING)
	private BowlStyleEnum bowling_style;
	
	@Column(name="role")
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

	public BatStyleEnum getBatting_style() {
		return batting_style;
	}

	public void setBatting_style(BatStyleEnum batting_style) {
		this.batting_style = batting_style;
	}

	public BowlStyleEnum getBowling_style() {
		return bowling_style;
	}

	public void setBowling_style(BowlStyleEnum bowling_style) {
		this.bowling_style = bowling_style;
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
