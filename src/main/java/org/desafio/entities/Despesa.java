package org.desafio.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.desafio.enums.TipoRelatorioEnum;

@Entity
public class Despesa {
	public static final String GET_DESPESAS_MENSAIS = 
			"SELECT new Despesa(d.mes, SUM(d.valorLiquidado)) FROM Despesa d GROUP BY d.mes";
	
	public static final String GET_DESPESAS_POR_CATEGORIA = 
			"SELECT new Despesa(d.categoriaEconomica.codigoCategoriaEconomica, SUM(d.valorLiquidado), 1) "
			+ "FROM Despesa d GROUP BY d.categoriaEconomica.codigoCategoriaEconomica";
	
	public static final String GET_DESPESAS_POR_FONTE_RECURSO = 
			"SELECT new Despesa(d.fonteRecurso.codigoFonteRecurso, SUM(d.valorLiquidado), 2) "
			+ "FROM Despesa d GROUP BY d.fonteRecurso.codigoFonteRecurso";
	
	@Id
	@GeneratedValue
	private Long codigoDespesa;
	
	private Short ano;
	
	private Byte mes;
	
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
	 * Construtor utilizado para retorno customizado nos métodos que apuram os gastos por mês.
	 * 
	 * @param mes - mes da despesa.
	 * @param valorLiquidado - total gasto no mês.
	 */
	public Despesa(Byte mes, BigDecimal valorLiquidado) {
		this.mes = mes;
		this.valorLiquidado = valorLiquidado;
	}
	
	/**
	 * Construtor utilizado para retorno customizado nos métodos que apuram os gastos por categoria economica
	 * e fonte de recurso.
	 * 
	 * @param mes - mes da despesa.
	 * @param valorLiquidado - total gasto no mês.
	 * @param tipoRelatorio - identifica qual tipo de somatório está sendo criado.
	 * 1 = categoria economica, 2 = fonte de recurso.
	 */
	public Despesa(Long codigoEntidade, BigDecimal valorLiquidado, Integer tipoRelatorio) {
		if (TipoRelatorioEnum.TIPO_RELATORIO_CATEGORIA.getCodigoTipoRelatorio().equals(tipoRelatorio)) {
			CategoriaEconomica categoriaEconomica = new CategoriaEconomica();
			categoriaEconomica.setCodigoCategoriaEconomica(codigoEntidade);
			
			this.categoriaEconomica = categoriaEconomica;
		} else if (TipoRelatorioEnum.TIPO_RELATORIO_FONTE_RECURSO.getCodigoTipoRelatorio().equals(tipoRelatorio)) {
			FonteRecurso fonteRecurso = new FonteRecurso();
			fonteRecurso.setCodigoFonteRecurso(codigoEntidade);
			
			this.fonteRecurso = fonteRecurso;
		}
		
		this.valorLiquidado = valorLiquidado;
	}
	
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
