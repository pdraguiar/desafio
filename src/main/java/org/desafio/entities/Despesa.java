package org.desafio.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Despesa {
	@Id
	@GeneratedValue
	private Long codigoDespesa;
	
	private Short ano;
	
	private Short mes;
	
	@ManyToOne
	@JoinColumn(name = "codigoUnidade")
	private Unidade unidade;
	
	@ManyToOne
	@JoinColumn(name = "codigoCategoriaEconomica")
	private CategoriaEconomica categoriaEconomica;
	
	@ManyToOne
	@JoinColumn(name = "codigoGrupoDespesa")
	private GrupoDespesa grupoDespesa;
	
	@ManyToOne
	@JoinColumn(name = "codigoModalidadeAplicacao")
	private ModalidadeAplicacao modalidadeAplicacao;
	
	@ManyToOne
	@JoinColumn(name = "codigoFonteRecurso")
	private FonteRecurso fonteRecurso;
	
	@ManyToOne
	@JoinColumn(name = "codigoModalidadeEmpenho")
	private ModalidadeEmpenho modalidadeEmpenho;
	
	@ManyToOne
	@JoinColumn(name = "codigoModalidadeLicitacao")
	private ModalidadeLicitacao modalidadeLicitacao;
	
	@ManyToOne
	@JoinColumn(name = "codigoCredor")
	private Credor credor;
	
	private BigDecimal valorEmpenhado;
	
	private BigDecimal valorLiquidado;
	
	private BigDecimal valorPago;
	
	/**
	 * @return the id
	 */
	public Long getCodigoDespesa() {
		return codigoDespesa;
	}

	/**
	 * @param codigoDespesa the id to set
	 */
	public void setCodigoDespesa(Long codigoDespesa) {
		this.codigoDespesa = codigoDespesa;
	}

	/**
	 * @return the ano
	 */
	public Short getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(Short ano) {
		this.ano = ano;
	}

	/**
	 * @return the mes
	 */
	public Short getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(Short mes) {
		this.mes = mes;
	}

	/**
	 * @return the unidade
	 */
	public Unidade getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	/**
	 * @return the categoriaEconomica
	 */
	public CategoriaEconomica getCategoriaEconomica() {
		return categoriaEconomica;
	}

	/**
	 * @param categoriaEconomica the categoriaEconomica to set
	 */
	public void setCategoriaEconomica(CategoriaEconomica categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}

	/**
	 * @return the grupoDespesa
	 */
	public GrupoDespesa getGrupoDespesa() {
		return grupoDespesa;
	}

	/**
	 * @param grupoDespesa the grupoDespesa to set
	 */
	public void setGrupoDespesa(GrupoDespesa grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	/**
	 * @return the modalidadeAplicacao
	 */
	public ModalidadeAplicacao getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}

	/**
	 * @param modalidadeAplicacao the modalidadeAplicacao to set
	 */
	public void setModalidadeAplicacao(ModalidadeAplicacao modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}

	/**
	 * @return the fonteRecurso
	 */
	public FonteRecurso getFonteRecurso() {
		return fonteRecurso;
	}

	/**
	 * @param fonteRecurso the fonteRecurso to set
	 */
	public void setFonteRecurso(FonteRecurso fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	/**
	 * @return the modalidadeEmpenho
	 */
	public ModalidadeEmpenho getModalidadeEmpenho() {
		return modalidadeEmpenho;
	}

	/**
	 * @param modalidadeEmpenho the modalidadeEmpenho to set
	 */
	public void setModalidadeEmpenho(ModalidadeEmpenho modalidadeEmpenho) {
		this.modalidadeEmpenho = modalidadeEmpenho;
	}

	/**
	 * @return the modalidadeLicitacao
	 */
	public ModalidadeLicitacao getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	/**
	 * @param modalidadeLicitacao the modalidadeLicitacao to set
	 */
	public void setModalidadeLicitacao(ModalidadeLicitacao modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}

	/**
	 * @return the credor
	 */
	public Credor getCredor() {
		return credor;
	}

	/**
	 * @param credor the credor to set
	 */
	public void setCredor(Credor credor) {
		this.credor = credor;
	}

	/**
	 * @return the valorEmpenhado
	 */
	public BigDecimal getValorEmpenhado() {
		return valorEmpenhado;
	}

	/**
	 * @param valorEmpenhado the valorEmpenhado to set
	 */
	public void setValorEmpenhado(BigDecimal valorEmpenhado) {
		this.valorEmpenhado = valorEmpenhado;
	}

	/**
	 * @return the valorLiquidado
	 */
	public BigDecimal getValorLiquidado() {
		return valorLiquidado;
	}

	/**
	 * @param valorLiquidado the valorLiquidado to set
	 */
	public void setValorLiquidado(BigDecimal valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	/**
	 * @return the valorPago
	 */
	public BigDecimal getValorPago() {
		return valorPago;
	}

	/**
	 * @param valorPago the valorPago to set
	 */
	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
}
