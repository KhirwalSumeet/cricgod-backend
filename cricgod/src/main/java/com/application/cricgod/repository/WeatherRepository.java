package com.application.cricgod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.cricgod.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {
	
	@Query("select weather from Weather weather where weather.id=?1")
	public List<Weather> getWeatherById(int id);

}
