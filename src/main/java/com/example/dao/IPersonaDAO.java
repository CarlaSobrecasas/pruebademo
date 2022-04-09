package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Persona;

@Repository
public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
