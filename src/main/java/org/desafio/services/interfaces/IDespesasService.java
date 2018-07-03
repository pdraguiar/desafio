package org.desafio.services.interfaces;

import java.util.List;

import org.desafio.entities.Despesa;
import org.springframework.data.domain.Page;

public interface IDespesasService {
	
	/**
	 * Retorna as depesas mensais.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas do respectivo mês.
	 */
	public List<Despesa> getDespesasMensais();
	
	/**
	 * Retorna as depesas por categoria.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva categoria.
	 */
	public List<Despesa> getDespesasPorCategoria();
	
	/**
	 * Retorna as depesas por fonte do recurso.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva fonte de recurso.
	 */
	public List<Despesa> getDespesasPorFonteRecurso();

	/**
	 * Cria uma nova despesa.
	 * 
	 * @param despesa - despesa a ser criada.
	 * @return Despesa
	 */
	public Despesa create(Despesa despesa);
	
	/**
	 * Atualiza uma despesa existente.
	 * 
	 * @param despesa - despesa a ser atualizada.
	 * @return Despesa
	 */
	public Despesa update(Despesa despesa);

	/**
	 * Retorna uma despesa específica, baseado no codigoDespesa.
	 *
	 * @return Despesa
	 */
	public Despesa buscar(Long codigoDespesa);

	/**
	 * Lista as despesas cadastradas.
	 *
	 * @param pagina - pagina requisitada.
	 * @param porPagina - itens por página.
	 * @return Page<Despesa>
	 */
	public Page<Despesa> listarDespesas(Integer pagina, Integer porPagina);
}
