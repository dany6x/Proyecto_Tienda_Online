package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  //(exclude = {DataSourceAutoConfiguration.class })
public class ProyectoTiendaOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTiendaOnlineApplication.class, args);
	}

}