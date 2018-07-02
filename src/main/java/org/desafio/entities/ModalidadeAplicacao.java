package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModalidadeAplicacao {
	@Id
	@GeneratedValue
	private Long codigoModalidadeAplicacao;
	
	private String nome;
	
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
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param name the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
