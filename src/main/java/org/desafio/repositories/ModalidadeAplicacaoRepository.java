package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.ModalidadeAplicacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeAplicacaoRepository extends CrudRepository<ModalidadeAplicacao, Long>{
	public List<ModalidadeAplicacao> findAllByOrderByNome();

}