package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "categoriaEconomica")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriaEconomicaDTO {
	private Long codigoCategoriaEconomica;
	private String nome;

	/**
	 * @return the codigoCategoriaEconomica
	 */
	public Long getCodigoCategoriaEconomica() {
		return codigoCategoriaEconomica;
	}

	/**
	 * @param codigoCategoriaEconomica the codigoCategoriaEconomica to set
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
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
