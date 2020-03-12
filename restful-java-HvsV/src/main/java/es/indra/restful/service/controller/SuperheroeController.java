package es.indra.restful.service.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.indra.restful.service.exception.ResourceNotFoundException;
import es.indra.restful.service.model.Superheroe;
import es.indra.restful.service.model.Villano;
import es.indra.restful.service.repository.SuperheroeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SuperheroeController {
	
	@Autowired
	private SuperheroeRepository superheroeRepository;
	
	@GetMapping("/superheroes")
	public List<Superheroe> getAllSuperheroes() {
		return superheroeRepository.findAll();
	}
	
	@GetMapping("/superheroes/{id}")
	public ResponseEntity<Superheroe> 
	getSuperheroeById(@PathVariable(value = "id") Long superheroeId)
			throws ResourceNotFoundException {
		Superheroe superheroe = superheroeRepository.findById(superheroeId)
				.orElseThrow(() -> 
				new ResourceNotFoundException
				("Superheroe not found for this id :: " + superheroeId));
		return ResponseEntity.ok().body(superheroe);
	}
	
	@PostMapping("/superheroes")
	public Superheroe createSuperheroe(@Valid @RequestBody Superheroe superheroe) {
		return superheroeRepository.save(superheroe);
	}
	
	
	@DeleteMapping("/superheroes/{id}")
	public Map<String, Boolean> deleteSuperheroe
	(@PathVariable(value = "id") Long superheroeId)
			throws ResourceNotFoundException {
		Superheroe superheroe = superheroeRepository.findById(superheroeId)
				.orElseThrow(() -> 
				new ResourceNotFoundException
				("Superheroe not found for this id :: " 
				+ superheroeId));

		superheroeRepository.delete(superheroe);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
	
	
	
	
	

}
