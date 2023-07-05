package com.example.demo.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

//Especificar que esta clase funcionará como servicio
@Service
public class UsuarioService {
	//@Autowired 
	
	private UsuarioRepository usuarioRepository;
	
	//Constructor para inicializar Repositorio
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository =usuarioRepository;
	}
	
	//Método para obtener persona a través de su id utilizando el repositorio
	public Usuario obtenerporID(Integer id) {
		return this.usuarioRepository.findById(id).get();
	}
	
	//Método para guardar un usuario
	public Integer guardarUsuario( String nombre, String apellido_paterno,String apellido_materno,
			                       java.sql.Date fecha_nacimiento,String telefono,String correo_electronico,String password) {	
		
		//Nuevo objeto
		Usuario usuario= new Usuario();
		
		usuario.setNombre(nombre);
		usuario.setApellido_paterno(apellido_paterno);
		usuario.setApellido_materno(apellido_materno);
		usuario.setFecha_nacimiento(fecha_nacimiento);
		usuario.setTelefono(telefono);
		usuario.setCorreo_electronico(correo_electronico);
		usuario.setPassword(password);
		
		//Guardar el objeto usuario en el repositorio
		usuario= usuarioRepository.save(usuario);
		
		//Retornar el id
		return usuario.getId_usuario();		
	}
	
}
