package com.sintad.backendpruebapractica.entidad.infrastructure.out;

import com.sintad.backendpruebapractica.entidad.domain.model.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadRepository  extends JpaRepository<Entidad, Long> {
}
