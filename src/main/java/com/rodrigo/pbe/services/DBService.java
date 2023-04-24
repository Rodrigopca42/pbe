package com.rodrigo.pbe.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.pbe.domain.Categoria;
import com.rodrigo.pbe.repositories.CategoriaRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public void intancaDB() {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	

}
