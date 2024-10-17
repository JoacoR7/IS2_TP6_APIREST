package com.is2.tp3_ej6.services;

import org.springframework.stereotype.Service;

import com.is2.tp3_ej6.entities.Localidad;
import com.is2.tp3_ej6.repositories.BaseRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

	public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
		super(baseRepository);
	}
}
