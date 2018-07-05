package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modalidadeEmpenho")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModalidadeEmpenhoDTO {
	private Long codigoModalidadeEmpenho;
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
	 * @return the codigoModalidadeEmpenho
	 */
	public Long getCodigoModalidadeEmpenho() {
		return codigoModalidadeEmpenho;
	}

	/**
	 * @param codigoModalidadeEmpenho the codigoModalidadeEmpenho to set
	 */
	public void setCodigoModalidadeEmpenho(Long codigoModalidadeEmpenho) {
		this.codigoModalidadeEmpenho = codigoModalidadeEmpenho;
	}
}
