package es.indra.restful.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.restful.service.model.Superheroe;

@Repository
public interface SuperheroeRepository extends JpaRepository<Superheroe, Long> {

}
