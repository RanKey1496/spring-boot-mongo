package dev.tutorial.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import dev.tutorial.model.Promotion;

@Repository
public interface PromotionRepository extends MongoRepository<Promotion, String> {

	public List<Promotion> findAllByStatus(String status);

	public List<Promotion> findFirst10ByStatus(String status);

	public List<Promotion> findByPropertyCityNot(String city);

	public List<Promotion> findByPropertyStratumGreaterThan(int stratum);

	public List<Promotion> findByPropertyTypeAndPropertyCity(String type, String city);

	@Query("{ '$or': [{'property.stratum': ?0}, {'property.city': ?1}] }")
	public List<Promotion> findByStratumOrPropertyCity(int stratum, String city);

}
