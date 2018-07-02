package org.desafio.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orgao {
	@Id
	@GeneratedValue
	private Long codigoOrgao;
	private String nome;
	
	@OneToMany(mappedBy = "orgao")
	private List<Unidade> unidade;
	
	/**
	 * @return the id
	 */
	public Long getCodigoOrgao() {
		return codigoOrgao;
	}

	/**
	 * @param codigoOrgao the id to set
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
	 * @return the unidade
	 */
	public List<Unidade> getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(List<Unidade> unidade) {
		this.unidade = unidade;
	}

	/**
	 * @param name the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
