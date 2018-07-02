package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModalidadeLicitacao {
	@Id
	@GeneratedValue
	private Long codigoModalidadeLicitacao;
	
	private String nome;
	
	/**
	 * @return the codigoModalidadeLicitacao
	 */
	public Long getCodigoModalidadeEmpenho() {
		return codigoModalidadeLicitacao;
	}

	/**
	 * @param codigoModalidadeLicitacao the codigoModalidadeLicitacao to set
	 */
	public void setCodigoModalidadeLicitacao(Long codigoModalidadeLicitacao) {
		this.codigoModalidadeLicitacao = codigoModalidadeLicitacao;
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
