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
@Table(name="weather")
public class Weather {
	
	@Id
	@Column(name="id", unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="temperature", nullable = false)
	private int temperature;
	
	@Column(name = "humidity", nullable = false)
	private int humidity;
	
	@Column(name = "rainfall_chances", nullable = false)
	private int rainfallChances;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getRainfallChances() {
		return rainfallChances;
	}

	public void setRainfallChances(int rainfallChances) {
		this.rainfallChances = rainfallChances;
	}
}
