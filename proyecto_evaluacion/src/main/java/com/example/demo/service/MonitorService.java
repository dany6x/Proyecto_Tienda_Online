package com.example.demo.service;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MonitorDTO;

import com.example.demo.entity.Monitor;

import com.example.demo.repository.MonitorRepository;



@Service
public class MonitorService {
	
	@Autowired 
	private MonitorRepository monitorRepository;   //Variable para acceder al repositorio
	
	public MonitorService(MonitorRepository monitorRepository ) {
		this.monitorRepository=monitorRepository;
	}
	
	
	//GUARDAR
//	public Integer guardarMonitor(Integer tamanio, String marca, String modelo) {
//		Monitor monitor =new Monitor();
//		monitor.setTamanio(tamanio);        
//		monitor.setMarca(marca);
//		monitor.setModelo(modelo);
//		monitor=monitorRepository.save(monitor);
//		
//		return monitor.getId();		//regresar el id del monitor guardado
//	}
	
	public ResponseEntity<Object> guardarMonitor( MonitorDTO monitorDto) {	
			
		//Mostrar mensaje con pares clave-valor
		HashMap<String,Object> mensaje =new HashMap <>();
		

		//Agregar al mensaje que se registró correctamente
		mensaje.put("message","Se registró monitor correctamente");
		
		//ACTUALIZAR USUARIO		
		//Si llega el id sería para actualizar el monitor
		if(monitorDto.getId() !=null) {
			mensaje.put("message","Se actualizó monitor correctamente");
		}
		
		//Nuevo objeto tipo Usuario
		Monitor monitor= new Monitor ();
		
		//Guardar el objeto monitor en el repositorio
		monitor.setId(monitorDto.getId());
		monitor.setTamanio(monitorDto.getTamanio());
		monitor.setMarca(monitorDto.getMarca());
		monitor.setModelo(monitorDto.getModelo());
		
		
		//Guardar Monitor
		monitorRepository.save(monitor);
		
		//Mostrar mensaje de que se registró el usuario correctamente
		mensaje.put("datos", monitor);
		
		//Regresar respuesta con mensaje final
		return new ResponseEntity<>(mensaje, HttpStatus.CREATED );
		
	}		
		

	
	//OBTENER POR ID
	public Monitor obtenerpPorID(Integer id) {
		return this.monitorRepository.findById(id).get();
	}
	
	
	
	//OBTENER TODOS
	public List<Monitor> listarMonitores (){
		//Llama al metodo definido findAll
		return monitorRepository.findAll();
	}	
	
	
	
	//ELIMINAR
	public void  borrar_por_id( Integer id){	
		//Llama al metodo definido deleteByID
		monitorRepository.deleteById(id);
		  
		  }
	 	


}
