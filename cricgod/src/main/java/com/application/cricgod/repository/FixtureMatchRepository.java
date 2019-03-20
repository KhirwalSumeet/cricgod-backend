package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.FixtureMatchMapping;

public interface FixtureMatchRepository extends JpaRepository<FixtureMatchMapping, Integer> {

}
