package org.desafio.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "listaDespesas")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaDespesasDTO {
	private List<DespesaDTO> despesas;

	/**
	 * @return the despesas
	 */
	public List<DespesaDTO> getDespesas() {
		return despesas;
	}

	/**
	 * @param despesas the despesas to set
	 */
	public void setDespesas(List<DespesaDTO> despesas) {
		this.despesas = despesas;
	}
		
}
