package com.sintad.backendpruebapractica.entidad.domain.model;


import com.sintad.backendpruebapractica.contribuyente.domain.model.TipoContribuyente;
import com.sintad.backendpruebapractica.tipodocumento.domain.model.TipoDocumento;
import com.sintad.backendpruebapractica.usuario.domain.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_entidad")
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entidad", length = 11, nullable = false)
    private Long idEntidad;

    @Column(name = "nro_documento", length = 25, nullable = false)
    private String nroDocumento;

    @Column(name = "razon_social", length = 100, nullable = false)
    private String razonSocial;

    @Column(name = "nombre_comercial", length = 100, nullable = false)
    private String nombreComercial;

    @Column(name = "direccion", length = 250, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 50, nullable = false)
    private String telefono;

    @Column(name = "estado", length = 1, nullable = false)
    private int estado;


    //relacion de muchos a uno entidad y  tipoDocumento
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;

    //relacion de muchos a uno  entidad y  tipoContribuyente
    @ManyToOne
    @JoinColumn(name = "id_tipo_contribuyente")
    private TipoContribuyente tipoContribuyente;

    //relacion de muchos a uno  entidad y  usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


}
