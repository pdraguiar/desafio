package org.desafio.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.enums.MensagemErroEnum;
import org.desafio.exceptions.ErroDeNegocioException;
import org.desafio.facades.DespesasFacade;
import org.desafio.models.DespesaCategoriaDTO;
import org.desafio.models.DespesaDTO;
import org.desafio.models.DespesaFonteRecursoDTO;
import org.desafio.models.DespesaMensalDTO;
import org.desafio.models.DespesasAgrupadasDTO;
import org.desafio.models.ListaDespesasDTO;
import org.desafio.utils.ValidacaoUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/despesas")
@CrossOrigin(origins = "*")
public class DespesasController {
	@Autowired
	private DespesasFacade despesasFacade;
	
	/**
	 * Lista as despesas cadastradas.
	 *
	 * @param pagina - pagina requisitada.
	 * @param porPagina - itens por página.
	 * @return ResponseEntity<ListaDespesasDTO>
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListaDespesasDTO> listarDespesas(@RequestParam(defaultValue = "0") Integer pagina, 
	        @RequestParam(defaultValue = "10") Integer porPagina) {
		ListaDespesasDTO retorno = new ListaDespesasDTO();
		List<DespesaDTO> listaDespesas = new ArrayList<DespesaDTO>();
		Page<Despesa> despesas = despesasFacade.listarDespesas(pagina, porPagina);
		HttpHeaders responseHeaders = new HttpHeaders();
		
		if (ValidacaoUtil.isNotNull(despesas)) {
			ModelMapper modelMapper = new ModelMapper();
			
			for (Despesa despesa : despesas.getContent()) {
				listaDespesas.add(modelMapper.map(despesa, DespesaDTO.class));
			}
			
			retorno.setDespesas(listaDespesas);
		    responseHeaders.set("X-Total-Registros", String.valueOf(despesas.getTotalElements()));
		    responseHeaders.set("X-Quantidade-Paginas", String.valueOf(despesas.getTotalPages()));
		}
		
		return new ResponseEntity<ListaDespesasDTO>(retorno, responseHeaders, HttpStatus.OK);
	}
	
	/**
	 * Retorna as depesas mensais.
	 *
	 * @return ResponseEntity<DespesasAgrupadasDTO>
	 */
	@GetMapping(path="/mensais", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasDTO> getDespesasMensais() {
		DespesasAgrupadasDTO retorno = new DespesasAgrupadasDTO();
		List<Despesa> despesas = despesasFacade.getDespesasMensais();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaMensalDTO> listaDespesas = new ArrayList<DespesaMensalDTO>();
			
			for (Despesa despesaMensal : despesas) {
				DespesaMensalDTO despesaEBO = new DespesaMensalDTO();
				despesaEBO.setMes(despesaMensal.getMes());
				despesaEBO.setValorDespesas(despesaMensal.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasMensais(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasDTO>(retorno,HttpStatus.OK);
	}
	
	/**
	 * Retorna as depesas por categoria.
	 *
	 * @return ResponseEntity<DespesasAgrupadasDTO>
	 */
	@GetMapping(path="/categoria", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasDTO> getDespesasPorCategoria() {
		DespesasAgrupadasDTO retorno = new DespesasAgrupadasDTO();
		List<Despesa> despesas = despesasFacade.getDespesasPorCategoria();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaCategoriaDTO> listaDespesas = new ArrayList<DespesaCategoriaDTO>();
			
			for (Despesa despesaCategoria : despesas) {
				DespesaCategoriaDTO despesaEBO = new DespesaCategoriaDTO();
				despesaEBO.setCodigoCategoriaEconomica(
						despesaCategoria.getCategoriaEconomica().getCodigoCategoriaEconomica());
				despesaEBO.setNomeCategoriaEconomica(despesaCategoria.getCategoriaEconomica().getNome());
				despesaEBO.setValorDespesas(despesaCategoria.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasCategoria(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasDTO>(retorno,HttpStatus.OK);
	}
	
	/**
	 * Retorna as depesas por fonte de recurso.
	 *
	 * @return ResponseEntity<DespesasAgrupadasDTO>
	 */
	@GetMapping(path="/fonteRecurso", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasDTO> getDespesasPorFonteRecurso() {
		DespesasAgrupadasDTO retorno = new DespesasAgrupadasDTO();
		List<Despesa> despesas = despesasFacade.getDespesasPorFonteRecurso();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaFonteRecursoDTO> listaDespesas = new ArrayList<DespesaFonteRecursoDTO>();
			
			for (Despesa despesaCategoria : despesas) {
				DespesaFonteRecursoDTO despesaEBO = new DespesaFonteRecursoDTO();
				despesaEBO.setCodigoFonteRecurso(despesaCategoria.getFonteRecurso().getCodigoFonteRecurso());
				despesaEBO.setNomeFonteRecurso(despesaCategoria.getFonteRecurso().getNome());
				despesaEBO.setValorDespesas(despesaCategoria.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasFonteRecurso(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasDTO>(retorno,HttpStatus.OK);
	}
	
	/**
	 * Retorna uma despesa específica, baseado no codigoDespesa.
	 *
	 * @param codigoDespesa - codigo da despesa.
	 * @return ResponseEntity<DespesaDTO>
	 */
	@GetMapping(path="/{codigoDespesa}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesaDTO> buscar(@PathVariable("codigoDespesa") Long codigoDespesa) {
		Despesa despesa = despesasFacade.buscar(codigoDespesa);
		
		ModelMapper modelMapper = new ModelMapper();
		DespesaDTO despesaDTO = modelMapper.map(despesa, DespesaDTO.class);
		
		return new ResponseEntity<DespesaDTO>(despesaDTO,HttpStatus.OK);
	}

	/**
	 * Cria uma nova despesa.
	 * 
	 * @param despesa - despesa a ser criada.
	 * @return ResponseEntity<DespesaDTO>
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesaDTO> create(@RequestBody DespesaDTO despesa) {
		ModelMapper modelMapper = new ModelMapper();
		Despesa despesaToCreate = modelMapper.map(despesa, Despesa.class);
		Despesa despesaCreated = despesasFacade.create(despesaToCreate);
		DespesaDTO despesaDTO = modelMapper.map(despesaCreated, DespesaDTO.class);
		
		URI location = UriComponentsBuilder.fromPath("/despesas/{codigoDespesa}")
				.buildAndExpand(despesaCreated.getCodigoDespesa()).toUri();
		
		return ResponseEntity.created(location).body(despesaDTO);
	}

	/**
	 * Atualiza uma despesa existente.
	 * 
	 * @param codigoDespesa - codigo da despesa.
	 * @param despesa - despesa a ser atualizada.
	 * @return ResponseEntity<DespesaDTO>
	 */
	@PutMapping(path="/{codigoDespesa}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesaDTO> update(@PathVariable("codigoDespesa") Long codigoDespesa, 
			@RequestBody DespesaDTO despesa) {
		if (ValidacaoUtil.isNotNull(despesa) && 
			ValidacaoUtil.isNotNull(despesa.getCodigoDespesa()) &&
			!despesa.getCodigoDespesa().equals(codigoDespesa)) {
			throw new ErroDeNegocioException(MensagemErroEnum.PARAMETROS_NAO_COINCIDEM.getValor());
		}
		
		ModelMapper modelMapper = new ModelMapper();
		Despesa despesaToUpdate = modelMapper.map(despesa, Despesa.class);
		Despesa despesaUpdated = despesasFacade.update(despesaToUpdate);
		DespesaDTO despesaDTO = modelMapper.map(despesaUpdated, DespesaDTO.class);
		
		return ResponseEntity.ok(despesaDTO);
	}
}