package org.desafio.services.impl;

import org.desafio.entities.Usuario;
import org.desafio.repositories.UsuarioRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario byUsername =
                usuarioRepository.findByEmail(email);

        if (byUsername == null) {
            throw new UsernameNotFoundException(email);
        }

        return new User(byUsername.getEmail(), byUsername.getSenha(), Collections.emptyList());
    }
}
