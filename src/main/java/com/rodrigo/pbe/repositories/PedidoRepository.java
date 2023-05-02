package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
