package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Unidade {
	@Id
	private String codigoUnidade;
	
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoOrgao")
	private Orgao orgao;
	
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
	 * @return the orgao
	 */
	public Orgao getOrgao() {
		return orgao;
	}

	/**
	 * @param orgao the orgao to set
	 */
	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}

	/**
	 * @return the id
	 */
	public String getCodigoUnidade() {
		return codigoUnidade;
	}

	/**
	 * @param codigoUnidade the id to set
	 */
	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
}
