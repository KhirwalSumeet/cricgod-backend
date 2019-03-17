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
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Team caller_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id", insertable=false, updatable=false)
	private Team winner_id;
	
	@Column(name="decision")
	@Enumerated(EnumType.STRING)
	private TossDecisionEnum decision;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getCaller_id() {
		return caller_id;
	}

	public void setCaller_id(Team caller_id) {
		this.caller_id = caller_id;
	}

	public Team getWinner_id() {
		return winner_id;
	}

	public void setWinner_id(Team winner_id) {
		this.winner_id = winner_id;
	}

	public TossDecisionEnum getDecision() {
		return decision;
	}

	public void setDecision(TossDecisionEnum decision) {
		this.decision = decision;
	}
}
