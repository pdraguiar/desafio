package org.desafio.utils;

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
import org.desafio.models.DominioDTO;

public class DominiosUtil {

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosOrgao(List<DominioDTO> lista, List<Orgao> findAll) {
		for (Orgao orgao : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(orgao.getCodigoOrgao());
			dominio.setNomeDominio(orgao.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosUnidade(List<DominioDTO> lista, List<Unidade> findAll) {
		for (Unidade unidade : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominioString(unidade.getCodigoUnidade());
			dominio.setNomeDominio(unidade.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosCategoriaEconomica(List<DominioDTO> lista, List<CategoriaEconomica> findAll) {
		for (CategoriaEconomica categoriaEconomica : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(categoriaEconomica.getCodigoCategoriaEconomica());
			dominio.setNomeDominio(categoriaEconomica.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosGrupoDespesa(List<DominioDTO> lista, List<GrupoDespesa> findAll) {
		for (GrupoDespesa grupoDespesa : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(grupoDespesa.getCodigoGrupoDespesa());
			dominio.setNomeDominio(grupoDespesa.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosFonteRecurso(List<DominioDTO> lista, List<FonteRecurso> findAll) {
		for (FonteRecurso fonteRecurso : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(fonteRecurso.getCodigoFonteRecurso());
			dominio.setNomeDominio(fonteRecurso.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosModalidadeAplicacao(List<DominioDTO> lista, 
			List<ModalidadeAplicacao> findAll) {
		for (ModalidadeAplicacao modalidadeAplicacao : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(modalidadeAplicacao.getCodigoModalidadeAplicacao());
			dominio.setNomeDominio(modalidadeAplicacao.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosModalidadeEmpenho(List<DominioDTO> lista, 
			List<ModalidadeEmpenho> findAll) {
		for (ModalidadeEmpenho modalidadeEmpenho : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(modalidadeEmpenho.getCodigoModalidadeEmpenho());
			dominio.setNomeDominio(modalidadeEmpenho.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosModalidadeLicitacao(List<DominioDTO> lista, 
			List<ModalidadeLicitacao> findAll) {
		for (ModalidadeLicitacao modalidadeLicitacao : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(modalidadeLicitacao.getCodigoModalidadeLicitacao());
			dominio.setNomeDominio(modalidadeLicitacao.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}

	/**
	 * Método que conveter uma entidade determinada no tipo DominioDTO.
	 * 
	 * @param lista - lista do tipo DTO;
	 * @param findAll - lista do tipo da entidade.
	 * @return List<DominioDTO>
	 */
	public static List<DominioDTO> atribuirDominiosCredor(List<DominioDTO> lista, List<Credor> findAll) {
		for (Credor credor : findAll) {
			DominioDTO dominio = new DominioDTO();
			dominio.setCodigoDominio(credor.getCodigoCredor());
			dominio.setNomeDominio(credor.getNome());
			
			lista.add(dominio);
		}
		
		return lista;
	}
}
