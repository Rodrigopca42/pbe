package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
