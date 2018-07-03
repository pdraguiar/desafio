package org.desafio.models;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesaMensal")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesaMensalDTO {
	private Byte mes;
	private BigDecimal valorDespesas;
	/**
	 * @return the mes
	 */
	public Byte getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(Byte mes) {
		this.mes = mes;
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
