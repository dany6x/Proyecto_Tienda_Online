package com.example.demo.dto;

import com.example.demo.entity.Monitor;

public class MonitorDTO {
	
	public Integer id;
	public Integer tamanio;
	public String marca;
	public String modelo;
	
	//constructor vacio
	public MonitorDTO() {
		
	}
	
	//contructor
	public MonitorDTO(Monitor monitor) {
		this.id=monitor.getId();
		this.tamanio=monitor.getTamanio();
		this.marca=monitor.getMarca();
		this.modelo=monitor.getModelo();
		
			
	}


	
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
