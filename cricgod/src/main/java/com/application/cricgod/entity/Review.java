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
@Table(name = "review")
public class Review {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team_id")
	private Team team;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="match_details_id")
	private MatchDetails matchDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings_id")
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
