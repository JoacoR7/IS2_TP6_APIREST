package com.is2.tp3_ej6.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.is2.tp3_ej6.entities.Persona;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
	
	List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
	
	Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
	
	boolean existsByDni(int dni);
	
	@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
	List<Persona> search(@Param("filtro") String filtro);
	
	@Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
	Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
}
