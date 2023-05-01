package com.rodrigo.pbe.domain.enums;

public enum TipoCliente {
	
	PESSOA_FISICA(0, "ROLE_PESSOA FISICA"),
	PESSOA_JURIDICA(1, "ROLE_PESSOA JURIDICA");
	
	private Integer codigo;
	private String descricao;
	
	private TipoCliente(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Tipo Cliente não encontrdo! Id : "+ cod);
	}

}
