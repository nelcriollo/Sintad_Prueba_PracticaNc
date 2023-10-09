package com.sintad.backendpruebapractica.entidad.application.service;

import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadCreateDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadUpdateDTO;

import java.util.List;

public interface EntidadService {

    List<EntidadDTO> findAll();

    EntidadDTO findByID(long id);

    EntidadDTO save(EntidadCreateDTO entidadCreateDTO);

    EntidadDTO update(EntidadUpdateDTO entidadUpdateDTO);

    void delete(long id);
}
