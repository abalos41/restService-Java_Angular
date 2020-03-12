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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.indra.restful.service.exception.ResourceNotFoundException;
import es.indra.restful.service.model.Villano;
import es.indra.restful.service.repository.VillanoRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VillanoController {
	
	@Autowired
	private VillanoRepository villanoRepository;
	
	@GetMapping("/villanos")
	public List<Villano> getAllVillanos() {
		return villanoRepository.findAll();
	}
	
	@GetMapping("/villanos/{id}")
	public ResponseEntity<Villano> 
	getVillanoById(@PathVariable(value = "id") Long villanoId)
			throws ResourceNotFoundException {
		Villano villano = villanoRepository.findById(villanoId)
				.orElseThrow(() -> 
				new ResourceNotFoundException
				("Villano not found for this id :: " + villanoId));
		return ResponseEntity.ok().body(villano);
	}
	
	@PostMapping("/villanos")
	public Villano createVillano(@Valid @RequestBody Villano villano) {
		return villanoRepository.save(villano);
	}
	
	@DeleteMapping("/villanos/{id}")
	public Map<String, Boolean> deleteVillano
	(@PathVariable(value = "id") Long villanoId)
			throws ResourceNotFoundException {
		Villano villano = villanoRepository.findById(villanoId)
				.orElseThrow(() -> 
				new ResourceNotFoundException
				("Villano not found for this id :: " 
				+ villanoId));

		villanoRepository.delete(villano);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@PutMapping("/villanos/{id}")
	public ResponseEntity<Villano> updateVillano(@PathVariable(value = "id") Long villanoId,
			@Valid @RequestBody Villano villanoDetails) throws ResourceNotFoundException {
		Villano villano = villanoRepository.findById(villanoId)
				.orElseThrow(() -> new ResourceNotFoundException("Villano not found for this id :: " + villanoId));

		villano.setNombreReal(villanoDetails.getNombreReal());
		villano.setAlias(villanoDetails.getAlias());
		villano.setFechaNacimiento(villanoDetails.getFechaNacimiento());
		villano.setHabilidades(villanoDetails.getHabilidades());
		villano.setCiudadOrigen(villanoDetails.getCiudadOrigen());
		villano.setAmbicion(villanoDetails.getAmbicion());
		villano.setNumeroLacayos(villanoDetails.getNumeroLacayos());
		villano.setPersonasAsesinadas(villanoDetails.getPersonasAsesinadas());
		final Villano updatedVillano = villanoRepository.save(villano);
		return ResponseEntity.ok(updatedVillano);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
