package org.desafio.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dominio")
@XmlAccessorType(XmlAccessType.FIELD)
public class DominioDTO {
	private Long codigoDominio;
	private String codigoDominioString;
	private String nomeDominio;
	
	/**
	 * @return the codigoDominioString
	 */
	public String getCodigoDominioString() {
		return codigoDominioString;
	}
	/**
	 * @param codigoDominioString the codigoDominioString to set
	 */
	public void setCodigoDominioString(String codigoDominioString) {
		this.codigoDominioString = codigoDominioString;
	}
	/**
	 * @return the codigoDominio
	 */
	public Long getCodigoDominio() {
		return codigoDominio;
	}
	/**
	 * @param codigoDominio the codigoDominio to set
	 */
	public void setCodigoDominio(Long codigoDominio) {
		this.codigoDominio = codigoDominio;
	}
	/**
	 * @return the nomeDominio
	 */
	public String getNomeDominio() {
		return nomeDominio;
	}
	/**
	 * @param nomeDominio the nomeDominio to set
	 */
	public void setNomeDominio(String nomeDominio) {
		this.nomeDominio = nomeDominio;
	}
	

}
