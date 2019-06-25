package com.creativa.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pais")
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	
	@Column(name = "Id")
	private int id;
	
	@Column(name ="Nombre")
	private String nombre;
	
	@OneToMany(mappedBy="pais")
	private Set<Ciudad> cuidad;
	
	//constructor
	public Pais() {	
	}
    
	//getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Ciudad> getCuidad() {
		return cuidad;
	}

	public void setCuidad(Set<Ciudad> cuidad) {
		this.cuidad = cuidad;
	}
	
}
