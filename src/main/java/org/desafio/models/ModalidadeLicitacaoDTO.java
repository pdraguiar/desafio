package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modalidadeLicitacao")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModalidadeLicitacaoDTO {
	private Long codigoModalidadeLicitacao;
	private String nome;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codigoModalidadeLicitacao
	 */
	public Long getCodigoModalidadeLicitacao() {
		return codigoModalidadeLicitacao;
	}

	/**
	 * @param codigoModalidadeLicitacao the codigoModalidadeLicitacao to set
	 */
	public void setCodigoModalidadeLicitacao(Long codigoModalidadeLicitacao) {
		this.codigoModalidadeLicitacao = codigoModalidadeLicitacao;
	}
		
}
