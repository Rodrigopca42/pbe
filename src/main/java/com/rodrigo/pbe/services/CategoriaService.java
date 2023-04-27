package com.rodrigo.pbe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.pbe.domain.Categoria;
import com.rodrigo.pbe.repositories.CategoriaRepository;
import com.rodrigo.pbe.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID "
		+ id + ", Tipo " + Categoria.class.getName()));
		
	}
	
	
}
