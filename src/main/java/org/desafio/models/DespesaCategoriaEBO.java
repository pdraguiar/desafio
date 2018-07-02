package org.desafio.models;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesaCategoria")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesaCategoriaEBO {
	private Long codigoCategoriaEconomica;
	private BigDecimal valorDespesas;
	
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
	
	
}
