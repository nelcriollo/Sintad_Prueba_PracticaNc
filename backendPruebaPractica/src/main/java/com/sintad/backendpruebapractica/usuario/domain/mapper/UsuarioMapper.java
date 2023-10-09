package com.sintad.backendpruebapractica.usuario.domain.mapper;

import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioCreateDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioDTO;
import com.sintad.backendpruebapractica.usuario.domain.dto.UsuarioUpdateDTO;
import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper instancia = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO usuarioAUsuarioDTO (Usuario usuario);

    @Mapping(target = "password", source = "password", qualifiedByName = "encodePassword")
    Usuario usuarioCreateDTOAUsuario (UsuarioCreateDTO usuarioCreateDTO);

    @Named("encodePassword")
    default String encodePassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    Usuario usuarioUpdateDTOAUsuario (UsuarioUpdateDTO usuarioUpdateDTO);

    List<UsuarioDTO> listaUsuarioAUsuarioDTO(List<Usuario> listaUsuarios);

}
