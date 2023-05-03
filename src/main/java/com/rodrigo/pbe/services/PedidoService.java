package com.rodrigo.pbe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.pbe.domain.Pedido;
import com.rodrigo.pbe.repositories.PedidoRepository;
import com.rodrigo.pbe.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID "
		+ id + ", Tipo " + Pedido.class.getName()));
		
	}
	
	
}
