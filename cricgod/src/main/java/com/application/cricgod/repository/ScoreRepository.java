package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer> {

}
