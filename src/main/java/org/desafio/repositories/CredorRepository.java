package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.Credor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredorRepository extends CrudRepository<Credor, Long>{
	public List<Credor> findAllByOrderByNome();

}