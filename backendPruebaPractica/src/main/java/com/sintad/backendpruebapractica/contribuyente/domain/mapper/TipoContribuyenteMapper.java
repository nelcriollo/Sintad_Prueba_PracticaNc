package com.sintad.backendpruebapractica.contribuyente.domain.mapper;

import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteCreateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteUpdateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.model.TipoContribuyente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoContribuyenteMapper {

    TipoContribuyenteMapper instancia = Mappers.getMapper(TipoContribuyenteMapper.class);

    TipoContribuyenteDTO tipoContributesATipoContribuyenteDTO(TipoContribuyente tipoContribuyente);

    TipoContribuyente tipoContribuyenteCreateDTOATipoContribuyente(TipoContribuyenteCreateDTO tipoContribuyenteCreateDTO);

    TipoContribuyente tipoContribuyenteUpdateDTOATipoContribuyente(TipoContribuyenteUpdateDTO tipoContribuyenteUpdateDTO);

    List<TipoContribuyenteDTO> listaTipoContribuyenteATipoContribuyenteDTO(List<TipoContribuyente> listaTipoContribuyentes);
}
