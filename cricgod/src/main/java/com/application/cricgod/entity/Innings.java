package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.application.cricgod.enums.InningsNumberEnum;

@Entity
@Table(name="innings")
public class Innings {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="batting_team_id", insertable=false, updatable=false)
	private Team batting_team;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bowling_team_id", insertable=false, updatable=false)
	private Team bowling_team;
	
	@Column(name="decision")
	@Enumerated(EnumType.STRING)
	private InningsNumberEnum decision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getBatting_team() {
		return batting_team;
	}

	public void setBatting_team(Team batting_team) {
		this.batting_team = batting_team;
	}

	public Team getBowling_team() {
		return bowling_team;
	}

	public void setBowling_team(Team bowling_team) {
		this.bowling_team = bowling_team;
	}

	public InningsNumberEnum getDecision() {
		return decision;
	}

	public void setDecision(InningsNumberEnum decision) {
		this.decision = decision;
	}
}
