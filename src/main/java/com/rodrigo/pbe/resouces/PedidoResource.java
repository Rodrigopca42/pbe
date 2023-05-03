package com.rodrigo.pbe.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.pbe.domain.Pedido;
import com.rodrigo.pbe.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@Autowired
	public PedidoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Integer id){
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
