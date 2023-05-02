package com.rodrigo.pbe.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rodrigo.pbe.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date dataDeVencimento;
	
	@Temporal(TemporalType.DATE)
	private Date dataDePagamento;
	
	public PagamentoComBoleto() {
		super();
	}
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataDeVencimento, Date dataDePagamento) {
		super(id, estado, pedido);
		this.dataDeVencimento = dataDeVencimento;
		this.dataDePagamento = dataDePagamento;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}
	
	

}
