package com.sintad.backendpruebapractica.entidad.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sintad.backendpruebapractica.contribuyente.domain.model.TipoContribuyente;
import com.sintad.backendpruebapractica.tipodocumento.domain.model.TipoDocumento;
import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import lombok.Data;

@Data
public class EntidadDTO {

    private Long idEntidad;

    private String nroDocumento;

    private String razonSocial;

    private String nombreComercial;

    private String direccion;

    private String telefono;

    private int estado;

    private TipoDocumento tipoDocumento;

    private TipoContribuyente tipoContribuyente;

    @JsonIgnore
    private Usuario usuario;
}
