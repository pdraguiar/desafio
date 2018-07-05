package org.desafio.services.interfaces;

import java.util.List;

import org.desafio.models.DominioDTO;

public interface IDominiosService {
	
	/**
	 * Lista os valores de determinado domínio.
	 *
	 * @param nomeDominio - nome do domínio que os valores serão retornados.
	 * @return List<DominioDTO>
	 */
	public List<DominioDTO> listar(String nomeDominio);

	/**
	 * Carrega os dominios de unidade atrelados a determinado orgão.
	 *
	 * @param codigoOrgao - identificador do órgão.
	 * @return ResponseEntity<ListaDespesasDTO>
	 */
	public List<DominioDTO> getUnidadesByOrgao(Long codigoOrgao);
	
}
