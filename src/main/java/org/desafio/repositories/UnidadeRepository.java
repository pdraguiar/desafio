package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.Unidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends CrudRepository<Unidade, String>{
	public List<Unidade> findAllByOrderByNome();
}