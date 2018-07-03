package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "credor")
@XmlAccessorType(XmlAccessType.FIELD)
public class CredorDTO {
	private Long codigoCredor;

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
