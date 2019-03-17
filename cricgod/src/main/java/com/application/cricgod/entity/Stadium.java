/**
 * 
 */
package com.application.cricgod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stadium")
public class Stadium {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "capacity", nullable = false)
	private int capacity;
	
	@Column(name = "stadium_boundary_length_id", nullable = false)
	private int stadium_boundary_length_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getStadium_boundary_length_id() {
		return stadium_boundary_length_id;
	}

	public void setStadium_boundary_length_id(int stadium_boundary_length_id) {
		this.stadium_boundary_length_id = stadium_boundary_length_id;
	}
	

}
