package com.sintad.backendpruebapractica.tipodocumento.domain.dto;

import lombok.Data;

@Data
public class TipoDocumentoCreateDTO {

    private String codigo;

    private String nombre;

    private String descripcion;

    private int estado;

}
