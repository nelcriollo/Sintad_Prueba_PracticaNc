package com.sintad.backendpruebapractica.tipodocumento.infrastructure.out;

import com.sintad.backendpruebapractica.tipodocumento.domain.model.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository  extends JpaRepository<TipoDocumento, Long> {
}
