package com.application.cricgod.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "team")
@EntityListeners(AuditingEntityListener.class)
public class Team {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	@Column(name = "name", nullable = false)
    private String name;

	/**
	  * Gets id
	  * @return the id
      */
	public long getId() {
	    return id;
	}
	
	/**
	  * Sets id
     */
	public void setId(long id) {
	    this.id = id;
	}
	
	/**
	  * Gets name
	  * @return name
     */
	public String getName() {
	    return name;
	}
	
	/**
	  * Sets name
    */
	public void setName(String name) {
	    this.name = name;
	}
}
