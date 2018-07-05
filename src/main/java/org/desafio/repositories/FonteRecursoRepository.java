package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.FonteRecurso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonteRecursoRepository extends CrudRepository<FonteRecurso, Long>{
	public List<FonteRecurso> findAllByOrderByNome();

}