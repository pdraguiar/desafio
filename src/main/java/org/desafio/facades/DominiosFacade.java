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
}
