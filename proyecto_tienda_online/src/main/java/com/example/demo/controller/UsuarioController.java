package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DataDTO;
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

//Indicar que esta clase va a servir para recibir peticiones del cliente 
@RestController

public class UsuarioController {
	
	//Inyectar como depenencia el servicio al controlador con autowired
	@Autowired
	public UsuarioService usuarioService;
	
	//Generar entrada para los servicios de guardar, obtener ... puedan ser consumidos
	
	//Método para guardar (PUT) y estableciendo su entrada con parametros separados
	@PutMapping("/guardar")
	
	public ResponseEntity<Integer> guardarUsuario(@RequestParam("nombre") String nombre,@RequestParam("apellido_paterno") String apellido_paterno,
			@RequestParam("apellido_materno")String apellido_materno,@RequestParam("fecha_nacimiento") java.sql.Date fecha_nacimiento,
			@RequestParam("telefono")String telefono, @RequestParam("correo_electronico") String correo_electronico,
			@RequestParam("password")String password ){
		
		//
		Integer id= 0;
		
		//Usar try catch para errores, por ejemplo si el id aun es 0
		
		try {
			id=this.usuarioService.guardarUsuario(nombre, apellido_paterno, apellido_materno, fecha_nacimiento, telefono, correo_electronico, password);
		} catch(Exception e) {
			System.out.println("Error");
		}
		
		//Condicion para arrojar error genérico * aqui se establecen los posibles errores segun los casos de uso
		if (id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		//retornar el estatus como respuesta asumiendo que la petición es positiva
		return new ResponseEntity<>(id,HttpStatus.OK);				

	}
	
	//Método para guardar usando DTO y dar uso a requestbody
	
	@PutMapping("/guardarDTO")
	public ResponseEntity<Integer>guardarUsuario(@RequestBody DataDTO data){
		
		Integer id= 0;
		
		//Usar try catch para errores, por ejemplo si el id aun es 0
		
		try {
			id=this.usuarioService.guardarUsuario(data.getNombre(), data.getApellido_paterno(), data.getApellido_materno(),
					data.getFecha_nacimiento(), data.getTelefono(), data.getCorreo_electronico() , data.getPassword());
		} catch(Exception e) {
			System.out.println("Error");
		}
		
		//Condicion para arrojar error genérico * aqui se establecen los posibles errores segun los casos de uso
		if (id==0) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		//retornar el estatus como respuesta asumiendo que la petición es positiva
		return new ResponseEntity<>(id,HttpStatus.OK);				

	}
	
	//Método para obtener el usuario a través del id (GET)
	@GetMapping ("/obtenerUsuario/{id}")
	
	//retorna objeto tipo DataDTO
	public ResponseEntity<DataDTO> obtenerUsuario(@PathVariable("id") Integer id){
		
		Usuario usuario= this.usuarioService.obtenerporID(id);
		
		//mandar los datos a traves del DataDTO
		DataDTO data= new DataDTO(usuario);
				
		
		//retornar el estatus como respuesta asumiendo que la petición es positiva
		return new ResponseEntity<>(data,HttpStatus.OK);				

		
	}	
	
		
	}	
	
	
	


