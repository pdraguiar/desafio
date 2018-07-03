package org.desafio.models;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "despesa")
@XmlAccessorType(XmlAccessType.FIELD)
public class DespesaDTO {
	private Long codigoDespesa;
	private Short ano;
	private Byte mes;
	private BigDecimal valorEmpenhado;
	private BigDecimal valorLiquidado;
	private BigDecimal valorPago;
	private UnidadeDTO unidade;
	private CategoriaEconomicaDTO categoriaEconomica;
	private GrupoDespesaDTO grupoDespesa;
	private FonteRecursoDTO fonteRecurso;
	private ModalidadeAplicacaoDTO modalidadeAplicacao;
	private ModalidadeEmpenhoDTO modalidadeEmpenho;
	private ModalidadeLicitacaoDTO modalidadeLicitacao;
	private CredorDTO credor;
	
	/**
	 * @return the codigoDespesa
	 */
	public Long getCodigoDespesa() {
		return codigoDespesa;
	}
	/**
	 * @param codigoDespesa the codigoDespesa to set
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
	/**
	 * @return the unidade
	 */
	public UnidadeDTO getUnidade() {
		return unidade;
	}
	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(UnidadeDTO unidade) {
		this.unidade = unidade;
	}
	/**
	 * @return the categoriaEconomica
	 */
	public CategoriaEconomicaDTO getCategoriaEconomica() {
		return categoriaEconomica;
	}
	/**
	 * @param categoriaEconomica the categoriaEconomica to set
	 */
	public void setCategoriaEconomica(CategoriaEconomicaDTO categoriaEconomica) {
		this.categoriaEconomica = categoriaEconomica;
	}
	/**
	 * @return the grupoDespesa
	 */
	public GrupoDespesaDTO getGrupoDespesa() {
		return grupoDespesa;
	}
	/**
	 * @param grupoDespesa the grupoDespesa to set
	 */
	public void setGrupoDespesa(GrupoDespesaDTO grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}
	/**
	 * @return the fonteRecurso
	 */
	public FonteRecursoDTO getFonteRecurso() {
		return fonteRecurso;
	}
	/**
	 * @param fonteRecurso the fonteRecurso to set
	 */
	public void setFonteRecurso(FonteRecursoDTO fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}
	/**
	 * @return the modalidadeAplicacao
	 */
	public ModalidadeAplicacaoDTO getModalidadeAplicacao() {
		return modalidadeAplicacao;
	}
	/**
	 * @param modalidadeAplicacao the modalidadeAplicacao to set
	 */
	public void setModalidadeAplicacao(ModalidadeAplicacaoDTO modalidadeAplicacao) {
		this.modalidadeAplicacao = modalidadeAplicacao;
	}
	/**
	 * @return the modalidadeEmpenho
	 */
	public ModalidadeEmpenhoDTO getModalidadeEmpenho() {
		return modalidadeEmpenho;
	}
	/**
	 * @param modalidadeEmpenho the modalidadeEmpenho to set
	 */
	public void setModalidadeEmpenho(ModalidadeEmpenhoDTO modalidadeEmpenho) {
		this.modalidadeEmpenho = modalidadeEmpenho;
	}
	/**
	 * @return the modalidadeLicitacao
	 */
	public ModalidadeLicitacaoDTO getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}
	/**
	 * @param modalidadeLicitacao the modalidadeLicitacao to set
	 */
	public void setModalidadeLicitacao(ModalidadeLicitacaoDTO modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}
	/**
	 * @return the credor
	 */
	public CredorDTO getCredor() {
		return credor;
	}
	/**
	 * @param credor the credor to set
	 */
	public void setCredor(CredorDTO credor) {
		this.credor = credor;
	}

}