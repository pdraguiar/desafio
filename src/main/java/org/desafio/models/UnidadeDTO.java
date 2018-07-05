package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "unidade")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnidadeDTO {
	private String codigoUnidade;
	private String nome;
	private OrgaoDTO orgao;

	/**
	 * @return the orgao
	 */
	public OrgaoDTO getOrgao() {
		return orgao;
	}

	/**
	 * @param orgao the orgao to set
	 */
	public void setOrgao(OrgaoDTO orgao) {
		this.orgao = orgao;
	}

	/**
	 * @return the codigoUnidade
	 */
	public String getCodigoUnidade() {
		return codigoUnidade;
	}

	/**
	 * @param codigoUnidade the codigoUnidade to set
	 */
	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
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
