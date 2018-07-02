package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.Despesa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesasRepository extends CrudRepository<Despesa, Long>{
	
	/**
	 * Retorna as depesas mensais.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas do respectivo mês.
	 */
	@Query(Despesa.GET_DESPESAS_MENSAIS)
	public List<Despesa> getDespesasMensais();
	
	/**
	 * Retorna as depesas por categoria.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva categoria.
	 */
	@Query(Despesa.GET_DESPESAS_POR_CATEGORIA)
	public List<Despesa> getDespesasPorCategoria();
	
	/**
	 * Retorna as depesas por fonte do recurso.
	 *
	 * @return List<Despesa>, onde cada elemento contém o somatório das despesas da respectiva fonte de recurso.
	 */
	@Query(Despesa.GET_DESPESAS_POR_FONTE_RECURSO)
	public List<Despesa> getDespesasPorFonteRecurso();
}