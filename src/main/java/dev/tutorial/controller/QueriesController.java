package dev.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.tutorial.model.Promotion;
import dev.tutorial.repository.PromotionRepository;

@RestController
@RequestMapping("/query")
public class QueriesController {

	@Autowired
	private PromotionRepository promotionRepository;

	@GetMapping("/status")
	public List<Promotion> getAllByStatus(@RequestParam("status") String status) {
		return promotionRepository.findAllByStatus(status);
	}

	@GetMapping("/top10")
	public List<Promotion> getTopTen(@RequestParam("status") String status) {
		return promotionRepository.findFirst10ByStatus(status);
	}

	@GetMapping("/count")
	public Long countAll() {
		return promotionRepository.count();
	}

	@GetMapping("/notincity")
	public List<Promotion> getPromotionNotIn(@RequestParam("city") String city) {
		return promotionRepository.findByPropertyCityNot(city);
	}

	@GetMapping("/stratumgt")
	public List<Promotion> getStratumGT(@RequestParam("stratum") int stratum) {
		return promotionRepository.findByPropertyStratumGreaterThan(stratum);
	}

	@GetMapping("/stratumorcity")
	public List<Promotion> getStratumOrCity(@RequestParam("stratum") int stratum, @RequestParam("city") String city) {
		return promotionRepository.findByStratumOrPropertyCity(stratum, city);
	}

	@GetMapping("/typeandcity")
	public List<Promotion> getTypeAndCity(@RequestParam("type") String type, @RequestParam("city") String city) {
		return promotionRepository.findByPropertyTypeAndPropertyCity(type, city);
	}
}
