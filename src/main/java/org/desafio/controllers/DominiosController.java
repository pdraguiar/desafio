package org.desafio.controllers;

import java.util.List;

import org.desafio.facades.DominiosFacade;
import org.desafio.models.DominioDTO;
import org.desafio.models.ListaDominiosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dominios")
@CrossOrigin(origins = "*")
public class DominiosController {
	@Autowired
	private DominiosFacade dominiosFacade;
	
	/**
	 * Lista os valores de determinado domínio.
	 *
	 * @param nomeDominio - nome do domínio que os valores serão retornados.
	 * @return ResponseEntity<ListaDespesasDTO>
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListaDominiosDTO> listar(@RequestParam String nomeDominio) {
		ListaDominiosDTO retorno = new ListaDominiosDTO();
		List<DominioDTO> lista = dominiosFacade.listar(nomeDominio);
		
		retorno.setDominios(lista);
		
		return new ResponseEntity<ListaDominiosDTO>(retorno, HttpStatus.OK);
	}
	
	/**
	 * Carrega os dominios de unidade atrelados a determinado orgão.
	 *
	 * @param codigoOrgao - identificador do órgão.
	 * @return ResponseEntity<ListaDespesasDTO>
	 */
	@GetMapping(path="/unidadesPorOrgao/{codigoOrgao}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListaDominiosDTO> getUnidadesByOrgao(@PathVariable("codigoOrgao") Long codigoOrgao) {
		ListaDominiosDTO retorno = new ListaDominiosDTO();
		List<DominioDTO> lista = dominiosFacade.getUnidadesByOrgao(codigoOrgao);
		
		retorno.setDominios(lista);
		
		return new ResponseEntity<ListaDominiosDTO>(retorno, HttpStatus.OK);
	}
}