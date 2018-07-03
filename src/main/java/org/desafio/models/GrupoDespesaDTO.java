package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "grupoDespesa")
@XmlAccessorType(XmlAccessType.FIELD)
public class GrupoDespesaDTO {
	private Long codigoGrupoDespesa;

	/**
	 * @return the codigoGrupoDespesa
	 */
	public Long getCodigoGrupoDespesa() {
		return codigoGrupoDespesa;
	}

	/**
	 * @param codigoGrupoDespesa the codigoGrupoDespesa to set
	 */
	public void setCodigoGrupoDespesa(Long codigoGrupoDespesa) {
		this.codigoGrupoDespesa = codigoGrupoDespesa;
	}

}
