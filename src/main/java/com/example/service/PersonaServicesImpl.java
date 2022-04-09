package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IPersonaDAO;
import com.example.entity.Persona;

@Service
public class PersonaServicesImpl implements IPersonaServices {

	@Autowired
	IPersonaDAO iPersonaDAO;
	
	@Override
	public List<Persona> listarPersona() {
		return iPersonaDAO.findAll();
	}

}
