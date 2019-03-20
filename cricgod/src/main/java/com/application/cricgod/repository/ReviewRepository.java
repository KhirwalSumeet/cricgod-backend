package com.application.cricgod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.cricgod.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
