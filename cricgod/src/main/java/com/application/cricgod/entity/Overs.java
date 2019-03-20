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
@Table(name = "overs")
public class Overs {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="match_details_id")
	private MatchDetails matchDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="innings_id")
	private Innings innings;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bowler_id")
	private Player bowler;
	
	@Column(name="runs", nullable=false)
	private int runs;
	
	@Column(name="wickets", nullable=false)
	private int wickets;
	
	@Column(name="extras", nullable=false)
	private int extras;
	
	@Column(name="dots", nullable=false)
	private int dots;
	
	@Column(name="ones", nullable=false)
	private int ones;
	
	@Column(name="twos", nullable=false)
	private int twos;
	
	@Column(name="threes", nullable=false)
	private int threes;
	
	@Column(name="fours", nullable=false)
	private int fours;
	
	@Column(name="fives", nullable=false)
	private int fives;

	@Column(name="sixes", nullable=false)
	private int sixes;

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

	public Innings getInnings() {
		return innings;
	}

	public void setInnings(Innings innings) {
		this.innings = innings;
	}

	public Player getBowler() {
		return bowler;
	}

	public void setBowler(Player bowler) {
		this.bowler = bowler;
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

	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}

	public int getDots() {
		return dots;
	}

	public void setDots(int dots) {
		this.dots = dots;
	}

	public int getOnes() {
		return ones;
	}

	public void setOnes(int ones) {
		this.ones = ones;
	}

	public int getTwos() {
		return twos;
	}

	public void setTwos(int twos) {
		this.twos = twos;
	}

	public int getThrees() {
		return threes;
	}

	public void setThrees(int threes) {
		this.threes = threes;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getFives() {
		return fives;
	}

	public void setFives(int fives) {
		this.fives = fives;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	
}
