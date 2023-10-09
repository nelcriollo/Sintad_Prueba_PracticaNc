package com.sintad.backendpruebapractica.usuario.domain.dto;

import lombok.Data;

@Data
public class UsuarioCreateDTO {

    private String nombre;

    private String login;

    private String password;
}
