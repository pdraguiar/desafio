package org.desafio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.facades.DespesasFacade;
import org.desafio.models.DespesaCategoriaEBO;
import org.desafio.models.DespesaFonteRecursoEBO;
import org.desafio.models.DespesaMensalEBO;
import org.desafio.models.DespesasAgrupadasEBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/despesas")
@CrossOrigin(origins = "*")
public class DespesasController {
	@Autowired
	private DespesasFacade despesasFacade;
	
	@GetMapping(path="/mensais", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasEBO> getDespesasMensais() {
		DespesasAgrupadasEBO retorno = new DespesasAgrupadasEBO();
		List<Despesa> despesas = despesasFacade.getDespesasMensais();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaMensalEBO> listaDespesas = new ArrayList<DespesaMensalEBO>();
			
			for (Despesa despesaMensal : despesas) {
				DespesaMensalEBO despesaEBO = new DespesaMensalEBO();
				despesaEBO.setMes(despesaMensal.getMes());
				despesaEBO.setValorDespesas(despesaMensal.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasMensais(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasEBO>(retorno,HttpStatus.OK);
	}
	
	@GetMapping(path="/categoria", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasEBO> getDespesasPorCategoria() {
		DespesasAgrupadasEBO retorno = new DespesasAgrupadasEBO();
		List<Despesa> despesas = despesasFacade.getDespesasPorCategoria();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaCategoriaEBO> listaDespesas = new ArrayList<DespesaCategoriaEBO>();
			
			for (Despesa despesaCategoria : despesas) {
				DespesaCategoriaEBO despesaEBO = new DespesaCategoriaEBO();
				despesaEBO.setCodigoCategoriaEconomica(
						despesaCategoria.getCategoriaEconomica().getCodigoCategoriaEconomica());
				despesaEBO.setValorDespesas(despesaCategoria.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasCategoria(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasEBO>(retorno,HttpStatus.OK);
	}
	
	@GetMapping(path="/fonteRecurso", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DespesasAgrupadasEBO> getDespesasPorFonteRecurso() {
		DespesasAgrupadasEBO retorno = new DespesasAgrupadasEBO();
		List<Despesa> despesas = despesasFacade.getDespesasPorFonteRecurso();
		
		if (despesas != null && !despesas.isEmpty()) {
			List<DespesaFonteRecursoEBO> listaDespesas = new ArrayList<DespesaFonteRecursoEBO>();
			
			for (Despesa despesaCategoria : despesas) {
				DespesaFonteRecursoEBO despesaEBO = new DespesaFonteRecursoEBO();
				despesaEBO.setCodigoFonteRecurso(
						despesaCategoria.getFonteRecurso().getCodigoFonteRecurso());
				despesaEBO.setValorDespesas(despesaCategoria.getValorLiquidado());
				
				listaDespesas.add(despesaEBO);
			}
			
			retorno.setDespesasFonteRecurso(listaDespesas);
		}
		
		return new ResponseEntity<DespesasAgrupadasEBO>(retorno,HttpStatus.OK);
	}

	/*@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> create(@RequestBody Product product) throws URISyntaxException {
		products.add(product);
		return ResponseEntity.created(new URI("products")).build();
	}*/

}