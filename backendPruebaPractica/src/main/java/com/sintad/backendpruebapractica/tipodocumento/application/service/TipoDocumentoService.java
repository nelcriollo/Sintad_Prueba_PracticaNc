package com.sintad.backendpruebapractica.tipodocumento.application.service;

import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoCreateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoUpdateDTO;

import java.util.List;

public interface TipoDocumentoService {

    List<TipoDocumentoDTO> findAll();

    TipoDocumentoDTO findByID(long id);

    TipoDocumentoDTO save(TipoDocumentoCreateDTO tipoDocumentoCreateDTO);

    TipoDocumentoDTO update(TipoDocumentoUpdateDTO tipoDocumentoUpdateDTO);

    void delete(long id);
}
