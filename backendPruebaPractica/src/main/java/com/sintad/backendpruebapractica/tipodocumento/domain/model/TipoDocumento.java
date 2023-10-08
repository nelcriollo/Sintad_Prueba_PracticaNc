package com.sintad.backendpruebapractica.tipodocumento.domain.model;


import com.sintad.backendpruebapractica.entidad.domain.model.Entidad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_documento", length = 11, nullable = false)
    private Long idTipoDocumento;

    @Column(name = "codigo", length = 20, nullable = false)
    private String codigo;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "estado", length = 1, nullable = false)
    private int estado;

    //realación de uno a muchos tipoDocumento y entidad
    @JsonIgnore
    @OneToMany(mappedBy = "idEntidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Entidad> entidades;
}
