package dev.tutorial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.tutorial.model.Promotion;

@Repository
public interface PromotionRepository extends MongoRepository<Promotion, String> {

}
