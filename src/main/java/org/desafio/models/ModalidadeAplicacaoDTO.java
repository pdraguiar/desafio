package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modalidadeAplicacao")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModalidadeAplicacaoDTO {
	private Long codigoModalidadeAplicacao;
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
	 * @return the codigoModalidadeAplicacao
	 */
	public Long getCodigoModalidadeAplicacao() {
		return codigoModalidadeAplicacao;
	}

	/**
	 * @param codigoModalidadeAplicacao the codigoModalidadeAplicacao to set
	 */
	public void setCodigoModalidadeAplicacao(Long codigoModalidadeAplicacao) {
		this.codigoModalidadeAplicacao = codigoModalidadeAplicacao;
	}
		
}
