package com.sintad.backendpruebapractica.usuario.application.service;

import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioCreateDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioUpdateDTO;

import java.util.List;

public interface UsuarioService {

    List<UsuarioDTO> findAll();

    UsuarioDTO findByID(long id);

    UsuarioDTO save(UsuarioCreateDTO usuarioCreateDTO);

    UsuarioDTO update(UsuarioUpdateDTO usuarioUpdateDTO);

    void delete(long id);
}
