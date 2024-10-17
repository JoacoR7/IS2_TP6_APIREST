package com.is2.tp3_ej6.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.is2.tp3_ej6.entities.Persona;

public interface PersonaService extends BaseService<Persona, Long>{
	List<Persona> search(String filtro) throws Exception;
	Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}