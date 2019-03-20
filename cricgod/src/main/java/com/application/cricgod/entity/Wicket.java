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

import com.application.cricgod.enums.WicketTypeEnum;


@Entity
@Table(name = "wicket")
public class Wicket {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="type", nullable=false)
	@Enumerated(EnumType.STRING)
	private WicketTypeEnum wicketType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="match_details_id")
	private MatchDetails matchDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bowler_id")
	private Player bowler;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fielder_id")
	private Player fielder;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="player_out_id")
	private Player playerOut;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public WicketTypeEnum getWicketType() {
		return wicketType;
	}

	public void setWicketType(WicketTypeEnum wicketType) {
		this.wicketType = wicketType;
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

	public Player getFielder() {
		return fielder;
	}

	public void setFielder(Player fielder) {
		this.fielder = fielder;
	}

	public Player getPlayerOut() {
		return playerOut;
	}

	public void setPlayerOut(Player playerOut) {
		this.playerOut = playerOut;
	}
	
}
