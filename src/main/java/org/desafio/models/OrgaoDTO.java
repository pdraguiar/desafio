package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "orgao")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrgaoDTO {
	private Long codigoOrgao;
	private String nome;

	/**
	 * @return the codigoOrgao
	 */
	public Long getCodigoOrgao() {
		return codigoOrgao;
	}

	/**
	 * @param codigoOrgao the codigoOrgao to set
	 */
	public void setCodigoOrgao(Long codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}

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
}
