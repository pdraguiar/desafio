package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credor")
@XmlAccessorType(XmlAccessType.FIELD)
public class CredorDTO {
	private Long codigoCredor;
	private String nome;
	

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
	 * @return the codigoCredor
	 */
	public Long getCodigoCredor() {
		return codigoCredor;
	}

	/**
	 * @param codigoCredor the codigoCredor to set
	 */
	public void setCodigoCredor(Long codigoCredor) {
		this.codigoCredor = codigoCredor;
	}
		
}
