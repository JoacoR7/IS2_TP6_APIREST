package com.is2.tp3_ej6.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.is2.tp3_ej6.entities.Persona;
import com.is2.tp3_ej6.repositories.BaseRepository;
import com.is2.tp3_ej6.repositories.PersonaRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

	@Autowired
	private PersonaRepository personaRepository;
	
	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
		super(baseRepository);
	}

	@Override
	public List<Persona> search(String filtro) throws Exception {
		try {
			//List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
			List<Persona> personas = personaRepository.search(filtro);
			return personas;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
		try {
			//List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
			Page<Persona> personas = personaRepository.search(filtro, pageable);
			return personas;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
