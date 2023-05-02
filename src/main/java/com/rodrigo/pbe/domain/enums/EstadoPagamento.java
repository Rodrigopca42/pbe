package com.rodrigo.pbe.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(0, "ROLE_PENDENTE"),
	QUITADO(1, "ROLE_QUITADO"),
	CANCELADO(2, "ROLE_CANCELADO");
	
	private Integer codigo;
	private String descrição;
	
	private EstadoPagamento(Integer codigo, String descrição) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento x: EstadoPagamento.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Estado de Pagamento não encontrado");
		
	}

}
