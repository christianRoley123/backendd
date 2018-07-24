package com.evento.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evento.model.Local;

public interface LocalRepository extends JpaRepository<Local, Integer>{
	
	@SuppressWarnings("unchecked")
	Local save(Local local);
}
