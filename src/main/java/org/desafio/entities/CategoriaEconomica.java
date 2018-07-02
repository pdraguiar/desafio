package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CategoriaEconomica {
	@Id
	@GeneratedValue
	private Long codigoCategoriaEconomica;
	
	private String nome;
	
	/**
	 * @return the id
	 */
	public Long getCodigoCategoriaEconomica() {
		return codigoCategoriaEconomica;
	}

	/**
	 * @param codigoCategoriaEconomica the id to set
	 */
	public void setCodigoCategoriaEconomica(Long codigoCategoriaEconomica) {
		this.codigoCategoriaEconomica = codigoCategoriaEconomica;
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
