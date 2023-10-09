package com.sintad.backendpruebapractica.usuario.domain.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private long idUsuario;

    private String nombre;

    private String login;

    private int estado;

}
