package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.ModalidadeEmpenho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeEmpenhoRepository extends CrudRepository<ModalidadeEmpenho, Long>{
	public List<ModalidadeEmpenho> findAllByOrderByNome();

}