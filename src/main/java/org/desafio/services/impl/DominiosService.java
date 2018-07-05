package org.desafio.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.desafio.entities.CategoriaEconomica;
import org.desafio.entities.Credor;
import org.desafio.entities.FonteRecurso;
import org.desafio.entities.GrupoDespesa;
import org.desafio.entities.ModalidadeAplicacao;
import org.desafio.entities.ModalidadeEmpenho;
import org.desafio.entities.ModalidadeLicitacao;
import org.desafio.entities.Orgao;
import org.desafio.entities.Unidade;
import org.desafio.enums.NomeDominioEnum;
import org.desafio.models.DominioDTO;
import org.desafio.repositories.CategoriaEconomicaRepository;
import org.desafio.repositories.CredorRepository;
import org.desafio.repositories.FonteRecursoRepository;
import org.desafio.repositories.GrupoDespesaRepository;
import org.desafio.repositories.ModalidadeAplicacaoRepository;
import org.desafio.repositories.ModalidadeEmpenhoRepository;
import org.desafio.repositories.ModalidadeLicitacaoRepository;
import org.desafio.repositories.OrgaoRepository;
import org.desafio.repositories.UnidadeRepository;
import org.desafio.services.interfaces.IDominiosService;
import org.desafio.utils.DominiosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DominiosService implements IDominiosService{
	@Autowired
	OrgaoRepository orgaoRepository;
	@Autowired
	UnidadeRepository unidadeRepository;
	@Autowired
	CategoriaEconomicaRepository categoriaEconomicaRepository;
	@Autowired
	GrupoDespesaRepository grupoDespesaRepository;
	@Autowired
	FonteRecursoRepository fonteRecursoRepository;
	@Autowired
	ModalidadeAplicacaoRepository modalidadeAplicacaoRepository;
	@Autowired
	ModalidadeEmpenhoRepository modalidadeEmpenhoRepository;
	@Autowired
	ModalidadeLicitacaoRepository modalidadeLicitacaoRepository;
	@Autowired
	CredorRepository credorRepository;
	
	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDominiosService#listar(java.lang.String)
	 */
	@Override
	public List<DominioDTO> listar(String nomeDominio) {
		List<DominioDTO> lista = new ArrayList<DominioDTO>();
		
		if (NomeDominioEnum.ORGAO.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<Orgao> target = new ArrayList<>();
			orgaoRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosOrgao(lista, target);
		} else if (NomeDominioEnum.UNIDADE.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<Unidade> target = new ArrayList<>();
			unidadeRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosUnidade(lista, target);
		} else if (NomeDominioEnum.CATEGORIA_ECONOMICA.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<CategoriaEconomica> target = new ArrayList<>();
			categoriaEconomicaRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosCategoriaEconomica(lista, target);
		} else if (NomeDominioEnum.GRUPO_DESPESA.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<GrupoDespesa> target = new ArrayList<>();
			grupoDespesaRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosGrupoDespesa(lista, target);
		} else if (NomeDominioEnum.FONTE_RECURSO.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<FonteRecurso> target = new ArrayList<>();
			fonteRecursoRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosFonteRecurso(lista, target);
		} else if (NomeDominioEnum.MODALIDADE_APLICACAO.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<ModalidadeAplicacao> target = new ArrayList<>();
			modalidadeAplicacaoRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosModalidadeAplicacao(lista, target);
		} else if (NomeDominioEnum.MODALIDADE_EMPENHO.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<ModalidadeEmpenho> target = new ArrayList<>();
			modalidadeEmpenhoRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosModalidadeEmpenho(lista, target);
		} else if (NomeDominioEnum.MODALIDADE_LICITACAO.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<ModalidadeLicitacao> target = new ArrayList<>();
			modalidadeLicitacaoRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosModalidadeLicitacao(lista, target);
		} else if (NomeDominioEnum.CREDOR.getNomeDominio().equalsIgnoreCase(nomeDominio)) {
			List<Credor> target = new ArrayList<>();
			credorRepository.findAllByOrderByNome().forEach(target::add);
			
			lista = DominiosUtil.atribuirDominiosCredor(lista, target);
		}
		
		return lista;
	}

	/* (non-Javadoc)
	 * @see org.desafio.services.interfaces.IDominiosService#getUnidadesByOrgao(java.lang.Long)
	 */
	@Override
	public List<DominioDTO> getUnidadesByOrgao(Long codigoOrgao) {
		List<Unidade> target = new ArrayList<>();
		List<DominioDTO> lista = new ArrayList<DominioDTO>();
		
		Orgao orgao = new Orgao();
		orgao.setCodigoOrgao(codigoOrgao);
		
		unidadeRepository.findAllByOrgaoOrderByNome(orgao).forEach(target::add);
		
		lista = DominiosUtil.atribuirDominiosUnidade(lista, target);
		
		return lista;
	}
}
