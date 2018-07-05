package org.desafio.enums;

public enum NomeDominioEnum {
	ORGAO("orgao"),
	UNIDADE("unidade"),
	CATEGORIA_ECONOMICA("categoriaEconomica"),
	GRUPO_DESPESA("grupoDespesa"),
	FONTE_RECURSO("fonteRecurso"),
	MODALIDADE_APLICACAO("modalidadeAplicacao"),
	MODALIDADE_EMPENHO("modalidadeEmpenho"),
	MODALIDADE_LICITACAO("modalidadeLicitacao"),
	CREDOR("credor");
	
	private String nomeDominio;
	
	NomeDominioEnum(String nomeDominio) {
		this.nomeDominio = nomeDominio;
	}
	
	public String getNomeDominio() {
		return this.nomeDominio;
	}
}
