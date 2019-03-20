package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stadium_boundary_length")
public class StadiumBoundaryLength {
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="sector1", nullable=false)
	private int sec1Length;
	
	@Column(name="sector2", nullable=false)
	private int sec2Length;
	
	@Column(name="sector3", nullable=false)
	private int sec3Length;
	
	@Column(name="sector4", nullable=false)
	private int sec4Length;
	
	@Column(name="sector5", nullable=false)
	private int sec5Length;
	
	@Column(name="sector6", nullable=false)
	private int sec6Length;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSec1Length() {
		return sec1Length;
	}

	public void setSec1Length(int sec1Length) {
		this.sec1Length = sec1Length;
	}

	public int getSec2Length() {
		return sec2Length;
	}

	public void setSec2Length(int sec2Length) {
		this.sec2Length = sec2Length;
	}

	public int getSec3Length() {
		return sec3Length;
	}

	public void setSec3Length(int sec3Length) {
		this.sec3Length = sec3Length;
	}

	public int getSec4Length() {
		return sec4Length;
	}

	public void setSec4Length(int sec4Length) {
		this.sec4Length = sec4Length;
	}

	public int getSec5Length() {
		return sec5Length;
	}

	public void setSec5Length(int sec5Length) {
		this.sec5Length = sec5Length;
	}

	public int getSec6Length() {
		return sec6Length;
	}

	public void setSec6Length(int sec6Length) {
		this.sec6Length = sec6Length;
	}
	
}
