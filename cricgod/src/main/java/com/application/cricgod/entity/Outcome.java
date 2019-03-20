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

import com.application.cricgod.enums.OutcomeTypeEnum;


@Entity
@Table(name = "outcome")
public class Outcome {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mom_id")
	private Player manOfMatch; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings1_score_id")
	private Score inn1Score;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings2_score_id")
	private Score inn2Score;
	
	@Column(name="isDL", nullable=false)
	private boolean isDl;
	
	@Column(name="type", nullable=false)
	@Enumerated(EnumType.STRING)
	private OutcomeTypeEnum outcomeType;
	
	@Column(name="win_margin", nullable=false)
	private int winMargin;
	
	@Column(name="target_runs", nullable=false)
	private int targetRuns;
	
	@Column(name="target_balls", nullable=false)
	private int targetBalls;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getManOfMatch() {
		return manOfMatch;
	}

	public void setManOfMatch(Player manOfMatch) {
		this.manOfMatch = manOfMatch;
	}

	public Score getInn1Score() {
		return inn1Score;
	}

	public void setInn1Score(Score inn1Score) {
		this.inn1Score = inn1Score;
	}

	public Score getInn2Score() {
		return inn2Score;
	}

	public void setInn2Score(Score inn2Score) {
		this.inn2Score = inn2Score;
	}

	public boolean isDl() {
		return isDl;
	}

	public void setDl(boolean isDl) {
		this.isDl = isDl;
	}

	public OutcomeTypeEnum getOutcomeType() {
		return outcomeType;
	}

	public void setOutcomeType(OutcomeTypeEnum outcomeType) {
		this.outcomeType = outcomeType;
	}

	public int getWinMargin() {
		return winMargin;
	}

	public void setWinMargin(int winMargin) {
		this.winMargin = winMargin;
	}

	public int getTargetRuns() {
		return targetRuns;
	}

	public void setTargetRuns(int targetRuns) {
		this.targetRuns = targetRuns;
	}

	public int getTargetBalls() {
		return targetBalls;
	}

	public void setTargetBalls(int targetBalls) {
		this.targetBalls = targetBalls;
	}
	
}
