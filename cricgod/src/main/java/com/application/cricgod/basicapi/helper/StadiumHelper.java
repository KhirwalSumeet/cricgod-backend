package com.application.cricgod.basicapi.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.cricgod.basicapi.beans.StadiumBoundaryDetailsBean;
import com.application.cricgod.basicapi.beans.StadiumDetailsBean;
import com.application.cricgod.entity.Stadium;
import com.application.cricgod.entity.StadiumBoundaryLength;


/**
 * This is a stadium related helper class
 */
@Component
public class StadiumHelper {
	
	/**
	 * This method maps list of Stadium Entities to list of StadiumDetails Beans
	 * @param players : List of Stadium Entities 
	 * 
	 * @return List of StadiumDetails Bean objects
	 */
	public List<StadiumDetailsBean> mapPlayersDetails(List<Stadium> stadiums) {
		List<StadiumDetailsBean> stadiumDetails =  new ArrayList<StadiumDetailsBean>();
		for(Stadium stadium : stadiums) {
			stadiumDetails.add(mapStadiumDetails(stadium));
		}
		
		return stadiumDetails;
	}
	
	/**
	 * This method maps Stadium Entity to StadiumDetails Bean
	 * @param player : Stadium entity object
	 * 
	 * @return Object of StadiumDetails Bean
	 */
	public StadiumDetailsBean mapStadiumDetails(Stadium stadium) {
		StadiumDetailsBean stadiumDetails =  new StadiumDetailsBean();
		if(stadium != null){
			stadiumDetails.setName(stadium.getName());
			stadiumDetails.setCity(stadium.getCity());
			stadiumDetails.setCountry(stadium.getCountry());
			stadiumDetails.setCapacity(stadium.getCapacity());
			stadiumDetails.setStadiumBoundaryDetails(mapStadiumBoundaryDetails(stadium.getStadiumBoundaryLength()));
		}
		
		return stadiumDetails;
	}
	
	/**
	 * This method maps StadiumBoundaryLength Entity to StadiumBoundaryDetails Bean
	 * @param player : StadiumBoundaryLength entity object
	 * 
	 * @return Object of StadiumBoundaryDetails Bean
	 */
	public StadiumBoundaryDetailsBean mapStadiumBoundaryDetails(StadiumBoundaryLength stadiumBoundary) {
		StadiumBoundaryDetailsBean stadiumBoundaryDetails =  new StadiumBoundaryDetailsBean();
		if(stadiumBoundary != null){
			stadiumBoundaryDetails.setSector1Length(stadiumBoundary.getSec1Length());
			stadiumBoundaryDetails.setSector2Length(stadiumBoundary.getSec2Length());
			stadiumBoundaryDetails.setSector3Length(stadiumBoundary.getSec3Length());
			stadiumBoundaryDetails.setSector4Length(stadiumBoundary.getSec4Length());
			stadiumBoundaryDetails.setSector5Length(stadiumBoundary.getSec5Length());
			stadiumBoundaryDetails.setSector6Length(stadiumBoundary.getSec6Length());
		}
		
		return stadiumBoundaryDetails;
	}
	
}
