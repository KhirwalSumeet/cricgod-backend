package com.application.cricgod.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "match_details")
public class MatchDetails {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="mtm_id", nullable=false)
	private MatchTeamMapping teamsDetails;
	
	@ManyToOne
	@JoinColumn(name="toss_id", nullable=false)
	private Toss toss;
	
	@ManyToOne
	@JoinColumn(name="stadium_id", nullable=false)
	private Stadium stadium;
	
	@ManyToOne
	@JoinColumn(name="weather_id", nullable=false)
	private Weather weather;
	
	@ManyToOne
	@JoinColumn(name="outcome_id", nullable=false)
	private Outcome outcome;
	
	@Column(name="date")
	private LocalDateTime matchDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MatchTeamMapping getTeamsDetails() {
		return teamsDetails;
	}

	public void setTeamsDetails(MatchTeamMapping teamsDetails) {
		this.teamsDetails = teamsDetails;
	}

	public Toss getToss() {
		return toss;
	}

	public void setToss(Toss toss) {
		this.toss = toss;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public Outcome getOutcome() {
		return outcome;
	}

	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}

	public LocalDateTime getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(LocalDateTime matchDate) {
		this.matchDate = matchDate;
	}
	
}
