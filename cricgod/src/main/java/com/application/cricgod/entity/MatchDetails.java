package com.application.cricgod.entity;

import java.time.LocalDateTime;

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
@Table(name = "match_details")
public class MatchDetails {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mtm_id")
	private MatchTeamMapping teamsDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="toss_id")
	private Toss toss;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="stadium_id")
	private Stadium stadium;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="weather_id")
	private Weather weather;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="outcome_id")
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
