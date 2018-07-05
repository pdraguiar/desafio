package org.desafio.facades;

import java.util.List;

import org.desafio.models.DominioDTO;
import org.desafio.services.interfaces.IDominiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DominiosFacade {

	@Autowired
	private IDominiosService iDominiosService;
	
	/**
	 * Lista os valores de determinado domínio.
	 *
	 * @param nomeDominio - nome do domínio que os valores serão retornados.
	 * @return List<DominioDTO>
	 */
	public List<DominioDTO> listar(String nomeDominio) {
		return iDominiosService.listar(nomeDominio);
	}

	/**
	 * Carrega os dominios de unidade atrelados a determinado orgão.
	 *
	 * @param codigoOrgao - identificador do órgão.
	 * @return ResponseEntity<ListaDespesasDTO>
	 */
	public List<DominioDTO> getUnidadesByOrgao(Long codigoOrgao) {
		return iDominiosService.getUnidadesByOrgao(codigoOrgao);
	}
}
