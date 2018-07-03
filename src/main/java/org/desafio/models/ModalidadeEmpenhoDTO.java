package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modalidadeEmpenho")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModalidadeEmpenhoDTO {
	private Long codigoModalidadeEmpenho;

	/**
	 * @return the codigoModalidadeEmpenho
	 */
	public Long getCodigoModalidadeEmpenho() {
		return codigoModalidadeEmpenho;
	}

	/**
	 * @param codigoModalidadeEmpenho the codigoModalidadeEmpenho to set
	 */
	public void setCodigoModalidadeEmpenho(Long codigoModalidadeEmpenho) {
		this.codigoModalidadeEmpenho = codigoModalidadeEmpenho;
	}
}
