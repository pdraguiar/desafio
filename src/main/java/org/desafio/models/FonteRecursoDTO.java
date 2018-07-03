package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fonteRecurso")
@XmlAccessorType(XmlAccessType.FIELD)
public class FonteRecursoDTO {
	private Long codigoFonteRecurso;

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

}
