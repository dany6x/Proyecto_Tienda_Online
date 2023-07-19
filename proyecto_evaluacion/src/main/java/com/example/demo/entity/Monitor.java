package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="monitores", schema="public")
public class Monitor {
	
	@Id //Indica que esa será la llave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Para que se generen automaticamente
	private Integer id;
	
	@Column(name="tamanio") //para que los nombres coincidan con los de la BD
	private Integer tamanio;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;



	//GETTERS Y SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	
		
}
