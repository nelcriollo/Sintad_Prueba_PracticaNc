package com.sintad.backendpruebapractica.contribuyente.infrastructure.out;

import com.sintad.backendpruebapractica.contribuyente.domain.model.TipoContribuyente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoContribuyenteRepository  extends JpaRepository<TipoContribuyente, Long> {
}
