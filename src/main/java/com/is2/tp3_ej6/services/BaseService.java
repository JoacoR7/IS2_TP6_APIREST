package com.is2.tp3_ej6.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.is2.tp3_ej6.entities.Base;

public interface BaseService<E extends Base, ID extends Serializable> {
	public List<E> findAll() throws Exception;
	public Page<E> findAll(Pageable pageable) throws Exception;
	public E findById(ID id) throws Exception;
	public E save(E entity) throws Exception;
	public E update(ID id, E entity) throws Exception;
	public boolean delete(ID id) throws Exception;
}
