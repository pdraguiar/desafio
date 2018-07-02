package org.desafio.services.interfaces;

import java.util.List;

import org.desafio.entities.Despesa;

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
}
