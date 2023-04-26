package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
