package org.desafio.enums;

public enum TipoRelatorioEnum {
	TIPO_RELATORIO_CATEGORIA(1),
	
	TIPO_RELATORIO_FONTE_RECURSO(2);
	
	private Integer codigoTipoRelatorio;
	
	TipoRelatorioEnum(Integer cdigoTipoRelatorio) {
		this.codigoTipoRelatorio = cdigoTipoRelatorio;
	}
	
	public Integer getCodigoTipoRelatorio() {
		return this.codigoTipoRelatorio;
	}
	
}
