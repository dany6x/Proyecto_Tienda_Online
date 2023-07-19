package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dto.MonitorDTO;

import com.example.demo.entity.Monitor;

import com.example.demo.service.MonitorService;


@RestController
public class MonitoresController {
	@Autowired
	public MonitorService monitorService;
	
	//Guardar

	/*
	 * @PutMapping("/guardar") public ResponseEntity<Integer>
	 * guardarMonitor(@RequestBody MonitorDTO data){ Integer id=0;
	 * 
	 * try { id=this.monitorService.guardarMonitor(data.getTamanio()
	 * ,data.getMarca() ,data.getModelo());
	 * 
	 * }catch(Exception e){ System.out.print("Error"); } if(id==0) { return new
	 * ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); } return new
	 * ResponseEntity<>(id, HttpStatus.OK); }
	 */
	
	//GUARDAR USUARIO
	@PostMapping ("/guardar")
	public ResponseEntity<Object> guardarMonitor(@RequestBody MonitorDTO monitorDto) {
				
		try {
			return monitorService.guardarMonitor(monitorDto);
			
		} catch(Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}	
	
	//OBTENER POR ID
	@GetMapping("/obtener/{id}")

	
	//retorna objeto que puede ser los datos del usuario o mensaje de error
	public ResponseEntity<Object> obtenerMonitor(@PathVariable("id") Integer id){
		
		try {
			Monitor monitor= this.monitorService.obtenerpPorID(id);
			
			//mandar los datos a traves del DataDTO
			MonitorDTO datos= new MonitorDTO(monitor);
			
			//retornar el estatus como respuesta asumiendo que la petición es positiva
			//return new ResponseEntity<>(datos,HttpStatus.OK);
			return ResponseEntity.status(HttpStatus.OK).body(datos);
		} catch(Exception e) {
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: Monitor no encontrado");
			
		}
		
	  }
	
	
	//OBTENER TODOS
	
	@GetMapping("/listar")
	public ResponseEntity<List<Monitor>> listarMonitores(){
		
		//Crear lista vacia
		List<Monitor> respuesta=null; 
		
		try {
			respuesta =monitorService.listarMonitores();
			return ResponseEntity.ok().body(respuesta);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 			
		}
		
	}
	
	
	//ELIMINAR
	@DeleteMapping ("/borrar/{id}")

	private ResponseEntity <String> borrarMonitor (@PathVariable("id") Integer id) {
		try {
			monitorService.borrar_por_id (id);
			return ResponseEntity.status(HttpStatus.OK).body("Monitor eliminado correctamente");
			
		} catch(Exception e) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: Monitor no encontrado");
		}

	}	

	
	//ACTUALIZAR  Monitor - Usa el mismo método que guardar monitor
	@PutMapping("/actualizar")
	public ResponseEntity<Object>actualizarMonitor(@RequestBody MonitorDTO monitorDto){
		try {
			return monitorService.guardarMonitor(monitorDto);
			
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}
	
		

}
