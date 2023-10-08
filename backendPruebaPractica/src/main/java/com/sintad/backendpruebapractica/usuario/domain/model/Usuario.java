package com.sintad.backendpruebapractica.usuario.domain.model;



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
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "login_usuario", length = 50, nullable = false)
    private String login;

    @Column(name = "password_usuario", length = 350, nullable = false)
    private String password;

    @Column(name = "estado")
    private int estado;

    //realación de uno a muchos usuario y entidad
    @JsonIgnore
    @OneToMany(mappedBy = "idEntidad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Entidad> entidades;
}
