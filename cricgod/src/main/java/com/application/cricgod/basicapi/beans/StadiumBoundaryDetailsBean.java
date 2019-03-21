package com.application.cricgod.basicapi.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Bean Class for details of Stadium Boundary lengths of different sectors
 * 
 */
@JsonInclude(Include.NON_NULL)
public class StadiumBoundaryDetailsBean {
	
	/** Length of sector-1 boundary */
	private int sector1Length;
	
	/** Length of sector-2 boundary */
	private int sector2Length;
	
	/** Length of sector-3 boundary */
	private int sector3Length;
	
	/** Length of sector-4 boundary */
	private int sector4Length;
	
	/** Length of sector-5 boundary */
	private int sector5Length;
	
	/** Length of sector-6 boundary */
	private int sector6Length;
	
	
	/**
	 * @return the sector1Length
	 */
	public int getSector1Length() {
		return sector1Length;
	}

	/**
	 * @param sector1Length the sector1Length to set
	 */
	public void setSector1Length(int sector1Length) {
		this.sector1Length = sector1Length;
	}

	/**
	 * @return the sector2Length
	 */
	public int getSector2Length() {
		return sector2Length;
	}

	/**
	 * @param sector2Length the sector2Length to set
	 */
	public void setSector2Length(int sector2Length) {
		this.sector2Length = sector2Length;
	}

	/**
	 * @return the sector3Length
	 */
	public int getSector3Length() {
		return sector3Length;
	}

	/**
	 * @param sector3Length the sector3Length to set
	 */
	public void setSector3Length(int sector3Length) {
		this.sector3Length = sector3Length;
	}

	/**
	 * @return the sector4Length
	 */
	public int getSector4Length() {
		return sector4Length;
	}

	/**
	 * @param sector4Length the sector4Length to set
	 */
	public void setSector4Length(int sector4Length) {
		this.sector4Length = sector4Length;
	}

	/**
	 * @return the sector5Length
	 */
	public int getSector5Length() {
		return sector5Length;
	}

	/**
	 * @param sector5Length the sector5Length to set
	 */
	public void setSector5Length(int sector5Length) {
		this.sector5Length = sector5Length;
	}

	/**
	 * @return the sector6Length
	 */
	public int getSector6Length() {
		return sector6Length;
	}

	/**
	 * @param sector6Length the sector6Length to set
	 */
	public void setSector6Length(int sector6Length) {
		this.sector6Length = sector6Length;
	}
	
}
