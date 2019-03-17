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
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Team batting_team_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Team bowling_team_id;
	
	@Column(name="decision")
	@Enumerated(EnumType.STRING)
	private InningsNumberEnum decision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getBatting_team_id() {
		return batting_team_id;
	}

	public void setBatting_team_id(Team batting_team_id) {
		this.batting_team_id = batting_team_id;
	}

	public Team getBowling_team_id() {
		return bowling_team_id;
	}

	public void setBowling_team_id(Team bowling_team_id) {
		this.bowling_team_id = bowling_team_id;
	}

	public InningsNumberEnum getDecision() {
		return decision;
	}

	public void setDecision(InningsNumberEnum decision) {
		this.decision = decision;
	}
}
