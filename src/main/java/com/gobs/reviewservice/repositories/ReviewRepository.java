package com.gobs.reviewservice.repositories;

import com.gobs.reviewservice.domain.ReviewEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<ReviewEntity, String> {

}