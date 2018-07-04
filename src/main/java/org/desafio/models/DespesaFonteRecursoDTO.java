package org.desafio.models;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesaFonteRecurso")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesaFonteRecursoDTO {
	private Long codigoFonteRecurso;
	private String nomeFonteRecurso;
	private BigDecimal valorDespesas;
	
	/**
	 * @return the valorDespesas
	 */
	public BigDecimal getValorDespesas() {
		return valorDespesas;
	}
	/**
	 * @param valorDespesas the valorDespesas to set
	 */
	public void setValorDespesas(BigDecimal valorDespesas) {
		this.valorDespesas = valorDespesas;
	}
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
	 * @return the nomeFonteRecurso
	 */
	public String getNomeFonteRecurso() {
		return nomeFonteRecurso;
	}
	/**
	 * @param nomeFonteRecurso the nomeFonteRecurso to set
	 */
	public void setNomeFonteRecurso(String nomeFonteRecurso) {
		this.nomeFonteRecurso = nomeFonteRecurso;
	}
	
	
}
