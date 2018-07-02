package org.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FonteRecurso {
	@Id
	@GeneratedValue
	private Long codigoFonteRecurso;
	
	private String nome;
	
	

	/**
	 * @return the codigoFonteRecurso
	 */
	public Long getCodigoFonteRecurso() {
		return codigoFonteRecurso;
	}

	/**
	 * @param codigoFonteRecurso the codigoFonteRecurso to set
	 */
	public void setCodigoFonteRecurso(Long codigoFonteRecurso) {
		this.codigoFonteRecurso = codigoFonteRecurso;
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
