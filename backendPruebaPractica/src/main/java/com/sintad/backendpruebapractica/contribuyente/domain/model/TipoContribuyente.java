package com.sintad.backendpruebapractica.contribuyente.domain.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sintad.backendpruebapractica.entidad.domain.model.Entidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tipo_contribuyente")
public class TipoContribuyente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_contribuyente", length = 11, nullable = false)
    private Long idTipoContribuyente;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "estado", length = 1, nullable = false)
    private int estado;


    //realación de uno a muchos tipoContribuyente y entidad
    @JsonIgnore
    @OneToMany(mappedBy = "idEntidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Entidad> entidades;

}
