package com.sintad.backendpruebapractica.usuario.infrastructure.out;

import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //Optional<Usuario> findByEmailAndPassword(String email, String password);

    Optional<Usuario> findByLogin(String login);
}
