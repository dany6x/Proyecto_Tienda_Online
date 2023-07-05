package com.example.demo.dto;

import com.example.demo.entity.Usuario;

public class DataDTO {
	
	//constructor vacio
	public DataDTO() {
		
	}
	
	//constructor que reciba como parametro a Usuario
	public DataDTO(Usuario usuario) {
		//Hacer asignacion de los datos de Usuario hacia DTO
		this.id = usuario.getId_usuario();
		this.apellido_paterno= usuario.getApellido_paterno();
		this.apellido_materno = usuario.getApellido_materno();
		this.fecha_nacimiento= usuario.getFecha_nacimiento();
		this.telefono =usuario.getTelefono();
		this.correo_electronico=usuario.getCorreo_electronico();
		this.password=usuario.getPassword();		
		
	}
	
	//Agregar los atributos del usuario 
	
	public Integer id;
	public String nombre;
	public String apellido_paterno;
	public String apellido_materno;
	public java.sql.Date fecha_nacimiento;
	public String telefono;
	public String correo_electronico;
	public String password;
	
	
	//GETTERS Y SETTERS
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public java.sql.Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(java.sql.Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
