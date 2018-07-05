package org.desafio.services.impl;

import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.enums.MensagemErroEnum;
import org.desafio.exceptions.ErroDeNegocioException;
import org.desafio.repositories.DespesasRepository;
import org.desafio.services.interfaces.IDespesasService;
import org.desafio.utils.ValidacaoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DespesasService implements IDespesasService{
	@Autowired
	private DespesasRepository despesasRepository;
	
	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasMensais()
	 */
	@Override
	public List<Despesa> getDespesasMensais() {
		List<Despesa> despesasMensais = despesasRepository.getDespesasMensais();
		
		return despesasMensais;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasPorCategoria()
	 */
	@Override
	public List<Despesa> getDespesasPorCategoria() {
		List<Despesa> despesasCategoria = despesasRepository.getDespesasPorCategoria();
		
		return despesasCategoria;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#getDespesasPorFonteRecurso()
	 */
	@Override
	public List<Despesa> getDespesasPorFonteRecurso() {
		List<Despesa> despesasCategoria = despesasRepository.getDespesasPorFonteRecurso();
		
		return despesasCategoria;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#create(org.desafio.entities.Despesa)
	 */
	@Override
	@Transactional
	public Despesa create(Despesa despesa) {
		Despesa retorno = null;
		
		if (validarCamposMandatorios(despesa)) {
			retorno = despesasRepository.save(despesa);
		} else {
			throw new ErroDeNegocioException(MensagemErroEnum.CAMPOS_MANDATORIOS.getValor());
		}

		return retorno;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#update(org.desafio.entities.Despesa)
	 */
	@Override
	@Transactional
	public Despesa update(Despesa despesa) {
		Despesa retorno = null;
		
		if (validarCamposMandatorios(despesa)) {
			if (despesasRepository.exists(despesa.getCodigoDespesa())) {
				retorno = despesasRepository.save(despesa);
			} else {
				throw new ErroDeNegocioException(MensagemErroEnum.ENTIDADE_NAO_ENCONTRADA.getValor());
			}
		} else {
			throw new ErroDeNegocioException(MensagemErroEnum.CAMPOS_MANDATORIOS.getValor());
		}

		return retorno;
	}
	
	/**
	 * Valida se os campos mandatórios para criação de uma despesa, estão devidamente preenchidos.
	 * 
	 * @param despesa - despesa a ser validada.
	 * @return boolean - true se válido, false se inválido.
	 */
	private boolean validarCamposMandatorios(Despesa despesa) {
		boolean isValido = false;
		
		if (ValidacaoUtil.isNotNull(despesa) &&
			ValidacaoUtil.isNotNull(despesa.getAno()) &&
			ValidacaoUtil.isNotNull(despesa.getMes()) &&
			ValidacaoUtil.isNotNull(despesa.getValorEmpenhado()) &&
			ValidacaoUtil.isNotNull(despesa.getValorLiquidado()) &&
			ValidacaoUtil.isNotNull(despesa.getValorPago()) &&
			ValidacaoUtil.isNotNull(despesa.getUnidade()) &&
			ValidacaoUtil.isNotNull(despesa.getUnidade().getCodigoUnidade()) &&
			ValidacaoUtil.isNotNull(despesa.getCategoriaEconomica()) &&
			ValidacaoUtil.isNotNull(despesa.getCategoriaEconomica().getCodigoCategoriaEconomica()) &&
			ValidacaoUtil.isNotNull(despesa.getGrupoDespesa()) &&
			ValidacaoUtil.isNotNull(despesa.getGrupoDespesa().getCodigoGrupoDespesa()) &&
			ValidacaoUtil.isNotNull(despesa.getFonteRecurso()) &&
			ValidacaoUtil.isNotNull(despesa.getFonteRecurso().getCodigoFonteRecurso()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeAplicacao()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeAplicacao().getCodigoModalidadeAplicacao()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeEmpenho()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeEmpenho().getCodigoModalidadeEmpenho()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeLicitacao()) &&
			ValidacaoUtil.isNotNull(despesa.getModalidadeLicitacao().getCodigoModalidadeLicitacao()) &&
			ValidacaoUtil.isNotNull(despesa.getCredor()) &&
			ValidacaoUtil.isNotNull(despesa.getCredor().getCodigoCredor())) {
			
			isValido = true;
		}
		
		return isValido;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#buscar(java.lang.Long)
	 */
	@Override
	public Despesa buscar(Long codigoDespesa) {
		Despesa retorno = null;
		
		if (ValidacaoUtil.isNotNull(codigoDespesa)) {
			retorno = despesasRepository.findOne(codigoDespesa);
			
			if (!ValidacaoUtil.isNotNull(retorno)) {
				throw new ErroDeNegocioException(MensagemErroEnum.ENTIDADE_NAO_ENCONTRADA.getValor());
			}
		} else {
			throw new ErroDeNegocioException(MensagemErroEnum.CAMPOS_MANDATORIOS.getValor());
		}
		
		return retorno;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDespesasService#listarDespesas(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Page<Despesa> listarDespesas(Integer pagina, Integer porPagina) {
		Page<Despesa> despesas = despesasRepository.findAll(new PageRequest(pagina, porPagina, 
				Sort.Direction.DESC, "codigoDespesa"));
		
		return despesas;
	}
}
