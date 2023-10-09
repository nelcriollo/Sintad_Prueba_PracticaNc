package com.sintad.backendpruebapractica.contribuyente.application.service;

import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteCreateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteUpdateDTO;

import java.util.List;

public interface TipoContribuyenteService {

    List<TipoContribuyenteDTO> findAll();

    TipoContribuyenteDTO findByID(long id);

    TipoContribuyenteDTO save(TipoContribuyenteCreateDTO tipoContribuyenteCreateDTO);

    TipoContribuyenteDTO update(TipoContribuyenteUpdateDTO tipoContribuyenteUpdateDTO);

    void delete(long id);
}
