package org.desafio.enums;

public enum MensagemErroEnum {
	CAMPOS_MANDATORIOS("Favor verificar o preenchimento dos campos mandatórios."),
	ENTIDADE_NAO_ENCONTRADA("Não foi encontrado nenhum registro com esses parâmetros de busca."),
	PARAMETROS_NAO_COINCIDEM("Os parâmetros de identificação recebidos não coincidem.");
	
	private String mensagemErro;
	
	MensagemErroEnum(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
	
	public String getValor() {
		return this.mensagemErro;
	}
}