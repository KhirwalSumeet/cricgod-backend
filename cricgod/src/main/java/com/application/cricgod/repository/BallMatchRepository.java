package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.BallMatchMapping;

public interface BallMatchRepository extends JpaRepository<BallMatchMapping, Integer> {

}
