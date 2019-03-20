package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "review")
public class Review {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="team_id", nullable=false)
	private Team team;
	
	@ManyToOne
	@JoinColumn(name="match_details_id", nullable=false)
	private MatchDetails matchDetails;
	
	@ManyToOne
	@JoinColumn(name="innings_id", nullable=false)
	private Innings innings;
	
	@Column(name="reviews_taken", nullable=false)
	private int reviewsTaken;
	
	@Column(name="reviews_successful", nullable=false)
	private int reviewsSuccessful;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public MatchDetails getMatchDetails() {
		return matchDetails;
	}

	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}

	public Innings getInnings() {
		return innings;
	}

	public void setInnings(Innings innings) {
		this.innings = innings;
	}

	public int getReviewsTaken() {
		return reviewsTaken;
	}

	public void setReviewsTaken(int reviewsTaken) {
		this.reviewsTaken = reviewsTaken;
	}

	public int getReviewsSuccessful() {
		return reviewsSuccessful;
	}

	public void setReviewsSuccessful(int reviewsSuccessful) {
		this.reviewsSuccessful = reviewsSuccessful;
	}
	
}
