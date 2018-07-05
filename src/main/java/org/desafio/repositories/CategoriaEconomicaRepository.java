package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.CategoriaEconomica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEconomicaRepository extends CrudRepository<CategoriaEconomica, Long>{
	public List<CategoriaEconomica> findAllByOrderByNome();
}