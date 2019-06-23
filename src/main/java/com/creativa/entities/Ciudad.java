package com.creativa.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ciudad")
public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")

	@Column(name = "Id")
	private int id;

	@Column(name = "Nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "IdCiudad", nullable = false)
	private Cliente cliente;
	
	 @OneToMany(mappedBy="cuidad")
	    private Set<Pais> pais;
	

	public Ciudad() {

	}

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Pais> getPais() {
		return pais;
	}

	public void setPais(Set<Pais> pais) {
		this.pais = pais;
	}
	
 
}
