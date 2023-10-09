package com.sintad.backendpruebapractica.tipodocumento.domain.mapper;

import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoCreateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoUpdateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.model.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoDocumentoMapper {

    TipoDocumentoMapper instancia = Mappers.getMapper(TipoDocumentoMapper.class);

    TipoDocumentoDTO tipoDocumentoATipoDocumentoDTO(TipoDocumento tipoDocumento);

    TipoDocumento tipoDocumentoCreateDTOATipoDocumento (TipoDocumentoCreateDTO tipoDocumentoCreateDTO);

    TipoDocumento tipoDocumentoUpdateDTOATipoDocumento (TipoDocumentoUpdateDTO tipoDocumentoUpdateDTO);

    List<TipoDocumentoDTO> listaTipoDocumentoATipoDocumentoDTO(List<TipoDocumento> listaTipoDocumentos);
}
