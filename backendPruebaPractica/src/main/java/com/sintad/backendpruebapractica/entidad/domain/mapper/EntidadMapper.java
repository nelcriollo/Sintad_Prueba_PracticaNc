package com.sintad.backendpruebapractica.entidad.domain.mapper;

import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadCreateDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadUpdateDTO;
import com.sintad.backendpruebapractica.entidad.domain.model.Entidad;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EntidadMapper {

    EntidadMapper instancia = Mappers.getMapper(EntidadMapper.class);

    EntidadDTO entidadAEntidadDTO(Entidad entidad);

    Entidad entidadCreateDTOAEntidad(EntidadCreateDTO entidadCreateDTO);

    Entidad entidadUpdateDTOAEntidad(EntidadUpdateDTO entidadUpdateDTO);

    List<EntidadDTO> listaEntidadesAEntidadesDTO(List<Entidad> listaEntidades);

}
