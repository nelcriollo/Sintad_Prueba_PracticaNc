package com.sintad.backendpruebapractica.tipodocumento.domain.dto;

import lombok.Data;

@Data
public class TipoDocumentoDTO {

    private Long idTipoDocumento;

    private String codigo;

    private String nombre;

    private String descripcion;

    private int estado;

}
