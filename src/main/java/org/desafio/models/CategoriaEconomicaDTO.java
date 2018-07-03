package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "categoriaEconomica")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriaEconomicaDTO {
	private Long codigoCategoriaEconomica;

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
		
}
