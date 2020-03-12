package es.indra.restful.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import es.indra.restful.service.repository.SuperheroeRepository;
import es.indra.restful.service.repository.VillanoRepository;
import es.indra.restful.service.model.Superheroe;
import es.indra.restful.service.model.Villano;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
    private VillanoRepository villanoRepository;
	@Autowired
    private SuperheroeRepository superheroeRepository;
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	 @Override
	 public void run(String... args) throws Exception {
			DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dateAsString = "25/12/2010";
			Date date = sourceFormat.parse(dateAsString);
			
	        Villano villano1 = new Villano
	        		("Slade Wilson", "Deathstroke", 
	        				date, "Artes Marciales", 
	        				"Chicago", "Matar gentuza en general", 0, 999);
	        
	        
	        Superheroe hero1 = new Superheroe("Clark Kent", "Superman", 
	        		"Dios venido a la tierra", "Planeta nosequé", 
	        		date, "Su planeta explotó y"
	        				+ " ahora salva gente en la Tierra", 1000234);
	        
	        
	        villanoRepository.save(villano1);
	        superheroeRepository.save(hero1);
	        
	        // =======================================

	    }
	
	
}
