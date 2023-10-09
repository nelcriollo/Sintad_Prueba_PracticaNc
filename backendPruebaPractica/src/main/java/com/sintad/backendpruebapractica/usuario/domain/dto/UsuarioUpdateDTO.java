package com.sintad.backendpruebapractica.usuario.domain.dto;

import lombok.Data;

@Data
public class UsuarioUpdateDTO {

    private long idUsuario;

    private String nombre;

    private String login;

    private String password;

    private int estado;
}
