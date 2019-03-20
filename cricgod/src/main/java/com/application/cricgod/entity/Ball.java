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

import com.application.cricgod.enums.ExtrasTypeEnum;


@Entity
@Table(name = "ball")
public class Ball {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="match_details_id")
	private MatchDetails matchDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bowler_id")
	private Player bowler;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="striker_id")
	private Player striker;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="non_striker_id")
	private Player nonStriker;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="overs_id")
	private Overs over;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings_id")
	private Innings innings;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="wicket_id")
	private Wicket wicket;
	
	@Column(name="runs", nullable=false)
	private int runs;
	
	@Column(name="extras", nullable=false)
	@Enumerated(EnumType.STRING)
	private ExtrasTypeEnum extrasType;
	
	@Column(name="is_boundary_four", nullable=false)
	private boolean isBoundaryFour;
	
	@Column(name="is_boundary_six", nullable=false)
	private boolean isBoundarySix;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MatchDetails getMatchDetails() {
		return matchDetails;
	}

	public void setMatchDetails(MatchDetails matchDetails) {
		this.matchDetails = matchDetails;
	}

	public Player getBowler() {
		return bowler;
	}

	public void setBowler(Player bowler) {
		this.bowler = bowler;
	}

	public Player getStriker() {
		return striker;
	}

	public void setStriker(Player striker) {
		this.striker = striker;
	}

	public Player getNonStriker() {
		return nonStriker;
	}

	public void setNonStriker(Player nonStriker) {
		this.nonStriker = nonStriker;
	}

	public Overs getOver() {
		return over;
	}

	public void setOver(Overs over) {
		this.over = over;
	}

	public Innings getInnings() {
		return innings;
	}

	public void setInnings(Innings innings) {
		this.innings = innings;
	}

	public Wicket getWicket() {
		return wicket;
	}

	public void setWicket(Wicket wicket) {
		this.wicket = wicket;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public ExtrasTypeEnum getExtrasType() {
		return extrasType;
	}

	public void setExtrasType(ExtrasTypeEnum extrasType) {
		this.extrasType = extrasType;
	}

	public boolean isBoundaryFour() {
		return isBoundaryFour;
	}

	public void setBoundaryFour(boolean isBoundaryFour) {
		this.isBoundaryFour = isBoundaryFour;
	}

	public boolean isBoundarySix() {
		return isBoundarySix;
	}

	public void setBoundarySix(boolean isBoundarySix) {
		this.isBoundarySix = isBoundarySix;
	}
	
}
