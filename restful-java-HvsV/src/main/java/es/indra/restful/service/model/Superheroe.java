package es.indra.restful.service.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Superheroe")
public class Superheroe {
	
	private long id;
	private String nombreReal;
	private String alias;
	private String habilidades;
	private String ciudadOrigen;
	private Date fechaNacimiento;
	private String historia;
	private int personasSalvadas;
	//@JsonManagedReference
	/*
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "superheroe_villano",
            joinColumns = { @JoinColumn(name = "superheroe_id") },
            inverseJoinColumns = { @JoinColumn(name = "villano_id") })
    private Set<Villano> archienemigo = new HashSet<>(); */
	
	
	public Superheroe() {}
	
	public Superheroe(String nombreReal, String alias, 
			String habilidades, String ciudadOrigen, Date fechaNacimiento
			, String historia, int personasSalvadas) {
		
		this.nombreReal = nombreReal;
		this.alias = alias;
		this.habilidades = habilidades;
		this.ciudadOrigen = ciudadOrigen;
		this.fechaNacimiento = fechaNacimiento;
		this.historia = historia;
		this.personasSalvadas = personasSalvadas;

	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "nombreReal", nullable = false)
	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	
	@Column(name = "alias", nullable = false)
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "habilidades", nullable = false)
	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	
	@Column(name = "ciudadOrigen", nullable = false)
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	@Column(name = "fechaNacimiento", nullable = false)
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "historia", nullable = false)
	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}
	
	@Column(name = "personasSalvadas", nullable = false)
	public int getPersonasSalvadas() {
		return personasSalvadas;
	}

	public void setPersonasSalvadas(int personasSalvadas) {
		this.personasSalvadas = personasSalvadas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
