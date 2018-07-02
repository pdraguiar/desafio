package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ModalidadeEmpenho {
	@Id
	@GeneratedValue
	private Long codigoModalidadeEmpenho;
	
	private String nome;
	
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
