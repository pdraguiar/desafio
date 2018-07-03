package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GrupoDespesa {
	@Id
	@GeneratedValue
	private Long codigoGrupoDespesa;
	
	private String nome;
	
	/**
	 * @return the codigoGrupoDespesa
	 */
	public Long getCodigoGrupoDespesa() {
		return codigoGrupoDespesa;
	}

	/**
	 * @param codigoGrupoDespesa the id to set
	 */
	public void setCodigoGrupoDespesa(Long codigoGrupoDespesa) {
		this.codigoGrupoDespesa = codigoGrupoDespesa;
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
