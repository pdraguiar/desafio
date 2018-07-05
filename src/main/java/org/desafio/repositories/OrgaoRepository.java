package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.Orgao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgaoRepository extends CrudRepository<Orgao, Long>{
	public List<Orgao> findAllByOrderByNome();
}