package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "unidade")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnidadeDTO {
	private String codigoUnidade;

	/**
	 * @return the codigoUnidade
	 */
	public String getCodigoUnidade() {
		return codigoUnidade;
	}

	/**
	 * @param codigoUnidade the codigoUnidade to set
	 */
	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
}
