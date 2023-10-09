package com.sintad.backendpruebapractica.usuario.application.impl;

import com.sintad.backendpruebapractica.usuario.application.service.UsuarioService;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioCreateDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioUpdateDTO;
import com.sintad.backendpruebapractica.usuario.domain.mapper.UsuarioMapper;
import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import com.sintad.backendpruebapractica.usuario.infrastructure.out.UsuarioRepository;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        return UsuarioMapper.instancia.listaUsuarioAUsuarioDTO(usuarioRepository.findAll());
    }

    @Override
    public UsuarioDTO findByID(long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            return UsuarioMapper.instancia.usuarioAUsuarioDTO(usuarioOptional.get());
        } else {
            throw new NoResultException("No se encontro el usuario con id: " + id);
        }
    }

    @Override
    public UsuarioDTO save(UsuarioCreateDTO usuarioCreateDTO) {
        Usuario usuario = UsuarioMapper.instancia.usuarioCreateDTOAUsuario(usuarioCreateDTO);
        return UsuarioMapper.instancia.usuarioAUsuarioDTO(usuarioRepository.save(usuario));
    }

    @Override
    public UsuarioDTO update(UsuarioUpdateDTO usuarioUpdateDTO) {
        Usuario usuario = UsuarioMapper.instancia.usuarioUpdateDTOAUsuario(usuarioUpdateDTO);
        return UsuarioMapper.instancia.usuarioAUsuarioDTO(usuarioRepository.save(usuario));
    }

    @Override
    public void delete(long id) {

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            usuarioRepository.delete(usuarioOptional.get());
        } else {
            throw new NoResultException("No se encontro el usuario con id: " + id);
        }

    }
}
