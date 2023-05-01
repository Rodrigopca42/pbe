package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
