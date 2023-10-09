package com.sintad.backendpruebapractica.contribuyente.domain.dto;

import lombok.Data;


@Data
public class TipoContribuyenteDTO {

    private Long idTipoContribuyente;

    private String nombre;

    private int estado;

}
