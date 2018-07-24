package com.evento.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evento.dao.LocalRepository;
import com.evento.model.Local;

@Service
public class LocalServiceImpl implements LocalService {
	
	//inyeccion de dependencia para que hagan parte de local repository
	@Autowired
	protected LocalRepository localRepository;

	@Override
	public Local save(Local local) {
		
		return this.localRepository.save(local);
	}

	@Override
	public List<Local> findAll() {
		
		return this.localRepository.findAll(); 
	}
	
	
	
}
