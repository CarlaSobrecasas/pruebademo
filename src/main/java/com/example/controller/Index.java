package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Persona;
import com.example.service.PersonaServicesImpl;

@RestController
public class Index {

	@Autowired
	PersonaServicesImpl personaServicesImpl;
	
	@GetMapping("/list")
	public List<Persona> listar(){
		
		return personaServicesImpl.listarPersona();
	}
	
	
	
	
}
