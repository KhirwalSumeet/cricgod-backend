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

import com.application.cricgod.enums.TossDecisionEnum;

@Entity
@Table(name="toss")
public class Toss {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="caller_id", insertable=false, updatable=false)
	private Team caller_team;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="winner_id", insertable=false, updatable=false)
	private Team winner_team;
	
	@Column(name="decision")
	@Enumerated(EnumType.STRING)
	private TossDecisionEnum decision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getCaller_team() {
		return caller_team;
	}

	public void setCaller_team(Team caller_team) {
		this.caller_team = caller_team;
	}

	public Team getWinner_team() {
		return winner_team;
	}

	public void setWinner_team(Team winner_team) {
		this.winner_team = winner_team;
	}

	public TossDecisionEnum getDecision() {
		return decision;
	}

	public void setDecision(TossDecisionEnum decision) {
		this.decision = decision;
	}
}
