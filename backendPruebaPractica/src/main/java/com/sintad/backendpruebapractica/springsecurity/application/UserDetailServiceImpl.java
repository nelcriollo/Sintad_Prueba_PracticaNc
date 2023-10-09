package com.sintad.backendpruebapractica.springsecurity.application;


import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import com.sintad.backendpruebapractica.usuario.infrastructure.out.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByLogin(loginName)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario  " + loginName + " no existe"));

        long usuarioId = usuario.getIdUsuario(); // Obtén el ID del usuario

        return new CustomUser(usuario.getLogin(),
                usuario.getPassword(),
                true,
                true,
                true,
                true,
                Collections.emptyList(),
                usuarioId);
    }
}
