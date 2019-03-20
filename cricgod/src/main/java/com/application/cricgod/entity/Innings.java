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
	private Team battingTeam;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bowling_team_id", insertable=false, updatable=false)
	private Team bowlingTeam;
	
	@Column(name="decision")
	@Enumerated(EnumType.STRING)
	private InningsNumberEnum decision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(Team battingTeam) {
		this.battingTeam = battingTeam;
	}

	public Team getBowlingTeam() {
		return bowlingTeam;
	}

	public void setBowlingTeam(Team bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	public InningsNumberEnum getDecision() {
		return decision;
	}

	public void setDecision(InningsNumberEnum decision) {
		this.decision = decision;
	}
}
