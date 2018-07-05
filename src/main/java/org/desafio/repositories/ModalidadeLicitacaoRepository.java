package org.desafio.repositories;

import java.util.List;

import org.desafio.entities.ModalidadeLicitacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeLicitacaoRepository extends CrudRepository<ModalidadeLicitacao, Long>{
	public List<ModalidadeLicitacao> findAllByOrderByNome();

}