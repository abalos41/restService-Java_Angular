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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "Villano")
public class Villano {
	
    private long id;
    private String nombreReal;
    private String alias;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date fechaNacimiento;
    private String habilidades;
    private String ciudadOrigen;
    private String ambicion;
    private int numeroLacayos;
    private int personasAsesinadas;
    /*@JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "archienemigo")
    private Set<Superheroe> archienemigo = new HashSet<>();*/
    

    public Villano() {}

    public Villano(String nombreReal, String alias, Date fechaNacimiento, 
    		String habilidades, String ciudadOrigen, 
    		String ambicion, int numeroLacayos, int personasAsesinadas ) {
    	
    	this.nombreReal = nombreReal;
    	this.alias = alias;
    	this.fechaNacimiento = fechaNacimiento;
    	this.habilidades = habilidades;
    	this.ciudadOrigen = ciudadOrigen;
    	this.ambicion = ambicion;
    	this.numeroLacayos = numeroLacayos;
    	this.personasAsesinadas = personasAsesinadas;
    	
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

	@Column(name = "fechaNacimiento", nullable = false)
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	@Column(name = "ambicion", nullable = false)
	public String getAmbicion() {
		return ambicion;
	}

	public void setAmbicion(String ambicion) {
		this.ambicion = ambicion;
	}

	@Column(name = "numeroLacayos", nullable = false)
	public int getNumeroLacayos() {
		return numeroLacayos;
	}

	public void setNumeroLacayos(int numeroLacayos) {
		this.numeroLacayos = numeroLacayos;
	}

	@Column(name = "personasAsesinadas", nullable = false)
	public int getPersonasAsesinadas() {
		return personasAsesinadas;
	}

	public void setPersonasAsesinadas(int personasAsesinadas) {
		this.personasAsesinadas = personasAsesinadas;
	}
    
    
    
    
    
    
}
