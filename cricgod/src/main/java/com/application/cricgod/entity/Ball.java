package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@ManyToOne
	@JoinColumn(name="match_details_id", nullable=false)
	private MatchDetails matchDetails;
	
	@ManyToOne
	@JoinColumn(name="bowler_id", nullable=false)
	private Player bowler;
	
	@ManyToOne
	@JoinColumn(name="striker_id", nullable=false)
	private Player striker_id;
	
	@ManyToOne
	@JoinColumn(name="overs_id", nullable=false)
	private Player overs_id;
	
	@ManyToOne
	@JoinColumn(name="innings_id", nullable=false)
	private Player innings_id;
	
	@ManyToOne
	@JoinColumn(name="wicket_id", nullable=false)
	private Player wicket_id;
	
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

	public Player getStriker_id() {
		return striker_id;
	}

	public void setStriker_id(Player striker_id) {
		this.striker_id = striker_id;
	}

	public Player getOvers_id() {
		return overs_id;
	}

	public void setOvers_id(Player overs_id) {
		this.overs_id = overs_id;
	}

	public Player getInnings_id() {
		return innings_id;
	}

	public void setInnings_id(Player innings_id) {
		this.innings_id = innings_id;
	}

	public Player getWicket_id() {
		return wicket_id;
	}

	public void setWicket_id(Player wicket_id) {
		this.wicket_id = wicket_id;
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
