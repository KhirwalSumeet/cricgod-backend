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
@Table(name = "mtm")
public class MatchTeamMapping {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team1_id")
	private Team team1;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team2_id")
	private Team team2;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team1_captain_id")
	private Player team1Captain;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team2_captain_id")
	private Player team2Captain;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team1_vcaptain_id")
	private Player team1ViceCaptain;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="team2_vcaptain_id")
	private Player team2ViceCaptain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Player getTeam1Captain() {
		return team1Captain;
	}

	public void setTeam1Captain(Player team1Captain) {
		this.team1Captain = team1Captain;
	}

	public Player getTeam2Captain() {
		return team2Captain;
	}

	public void setTeam2Captain(Player team2Captain) {
		this.team2Captain = team2Captain;
	}

	public Player getTeam1ViceCaptain() {
		return team1ViceCaptain;
	}

	public void setTeam1ViceCaptain(Player team1ViceCaptain) {
		this.team1ViceCaptain = team1ViceCaptain;
	}

	public Player getTeam2ViceCaptain() {
		return team2ViceCaptain;
	}

	public void setTeam2ViceCaptain(Player team2ViceCaptain) {
		this.team2ViceCaptain = team2ViceCaptain;
	}
	
}
