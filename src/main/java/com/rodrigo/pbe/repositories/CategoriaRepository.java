package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
