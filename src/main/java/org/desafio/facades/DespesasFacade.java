package org.desafio.facades;

import java.util.List;

import org.desafio.entities.Despesa;
import org.desafio.services.interfaces.IDespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class DespesasFacade {

	@Autowired
	private IDespesasService iDespesasService;
	
	/**
	 * Retorna as depesas mensais.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas do respectivo mês.
	 */
	public List<Despesa> getDespesasMensais() {
		return iDespesasService.getDespesasMensais();
	}
	
	/**
	 * Retorna as depesas por categoria.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva categoria.
	 */
	public List<Despesa> getDespesasPorCategoria() {
		return iDespesasService.getDespesasPorCategoria();
	}
	
	/**
	 * Retorna as depesas por fonte do recurso.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva fonte de recurso.
	 */
	public List<Despesa> getDespesasPorFonteRecurso() {
		return iDespesasService.getDespesasPorFonteRecurso();
	}

	/**
	 * Cria uma nova despesa.
	 * 
	 * @param despesa - despesa a ser criada.
	 * @return Despesa
	 */
	public Despesa create(Despesa despesa) {
		return iDespesasService.create(despesa);
	}

	/**
	 * Atualiza uma despesa existente.
	 * 
	 * @param despesa - despesa a ser atualizada.
	 * @return Despesa
	 */
	public Despesa update(Despesa despesa) {
		return iDespesasService.update(despesa);
	}

	/**
	 * Retorna uma despesa específica, baseado no codigoDespesa.
	 *
	 * @return Despesa
	 */
	public Despesa buscar(Long codigoDespesa) {
		return iDespesasService.buscar(codigoDespesa);
	}

	/**
	 * Lista as despesas cadastradas.
	 *
	 * @param pagina - pagina requisitada.
	 * @param porPagina - itens por página.
	 * @return Page<Despesa>
	 */
	public Page<Despesa> listarDespesas(Integer pagina, Integer porPagina) {
		return iDespesasService.listarDespesas(pagina, porPagina);
	}
}
