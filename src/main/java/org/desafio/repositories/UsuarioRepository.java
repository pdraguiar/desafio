package org.desafio.repositories;

import org.desafio.entities.Unidade;
import org.desafio.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByEmail(String email);
}
