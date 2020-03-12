package es.indra.restful.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.restful.service.model.Villano;

@Repository
public interface VillanoRepository extends JpaRepository<Villano, Long> {

}
