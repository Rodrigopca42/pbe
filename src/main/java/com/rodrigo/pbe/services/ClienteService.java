package com.rodrigo.pbe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.pbe.domain.Cliente;
import com.rodrigo.pbe.repositories.ClienteRepository;
import com.rodrigo.pbe.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	public ClienteRepository clienteRepository;

	public Cliente findById(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("O cliente com Id : "+ id + ", não foi encontrado")) ;
	}

}
