package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Credor {
	@Id
	@GeneratedValue
	private Long codigoCredor;
	
	private String nome;
	
	/**
	 * @return the id
	 */
	public Long getCodigoCredor() {
		return codigoCredor;
	}

	/**
	 * @param codigoCredor the id to set
	 */
	public void setCodigoCredor(Long codigoCredor) {
		this.codigoCredor = codigoCredor;
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
