package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.GrupoDespesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoDespesaRepository extends CrudRepository<GrupoDespesa, Long>{
	public List<GrupoDespesa> findAllByOrderByNome();

}