package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "score")
public class Score {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="runs", nullable=false)
	private int runs;
	
	@Column(name="wickets", nullable=false)
	private int wickets;
	
	@Column(name="balls_played", nullable=false)
	private int ballsPlayed;
	
	@Column(name="total_balls", nullable=false)
	private int totalBalls;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings_id")
	private Innings innings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getBallsPlayed() {
		return ballsPlayed;
	}

	public void setBallsPlayed(int ballsPlayed) {
		this.ballsPlayed = ballsPlayed;
	}

	public int getTotalBalls() {
		return totalBalls;
	}

	public void setTotalBalls(int totalBalls) {
		this.totalBalls = totalBalls;
	}

	public Innings getInnings() {
		return innings;
	}

	public void setInnings(Innings innings) {
		this.innings = innings;
	}
		
}
