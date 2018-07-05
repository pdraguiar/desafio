package org.desafio.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "listaDominios")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaDominiosDTO {
	private List<DominioDTO> dominios;

	/**
	 * @return the dominios
	 */
	public List<DominioDTO> getDominios() {
		return dominios;
	}

	/**
	 * @param dominios the dominios to set
	 */
	public void setDominios(List<DominioDTO> dominios) {
		this.dominios = dominios;
	}

		
}
