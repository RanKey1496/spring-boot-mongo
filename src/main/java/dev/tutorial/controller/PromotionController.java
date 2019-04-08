package dev.tutorial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.tutorial.model.Promotion;
import dev.tutorial.repository.PromotionRepository;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

	@Autowired
	private PromotionRepository promotionRepository;

	@GetMapping("/")
	public List<Promotion> getAllProperties() {
		return promotionRepository.findAll();
	}

	@GetMapping("/{id}")
	public Promotion getPropertyById(@PathVariable("id") String id) {
		Optional<Promotion> promotion = promotionRepository.findById(id);
		if (!promotion.isPresent())
			return null;
		return promotion.get();
	}

	@PostMapping("/")
	public String saveNewProperty(@RequestBody Promotion property) {
		Promotion saved = promotionRepository.save(property);
		if (saved == null)
			return "Ha ocurrido un error al guardar la propiedad";
		return "Propiedad guardada satisfactoriamente";
	}

	@PutMapping("/")
	public String updateProperty(@RequestBody Promotion property) {
		Promotion updated = promotionRepository.save(property);
		if (updated == null)
			return "Ha ocurrido un error al actualizar una propiedad";
		return "Propiedad actualizada satisfactoriamente";
	}

	@DeleteMapping("/{id}")
	public String deleteProperty(@RequestParam String id) {
		promotionRepository.deleteById(id);
		return "La propiedad ha sido eliminada";
	}

	@GetMapping("/count/by/type/apartments")
	public Integer countApartments() {
		// Integer count = promotionRepository.countByType("APARTAMENTO");
		return null;
	}

	/**
	 * TODO
	 */
	@GetMapping("/count/by/neighborhood/belen")
	public Integer countInBelen() {
		return null;
	}

}
