package com.rodrigo.pbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigo.pbe.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
