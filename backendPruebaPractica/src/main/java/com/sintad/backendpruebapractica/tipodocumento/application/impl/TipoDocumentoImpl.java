package com.sintad.backendpruebapractica.tipodocumento.application.impl;

import com.sintad.backendpruebapractica.tipodocumento.application.service.TipoDocumentoService;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoCreateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoUpdateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.mapper.TipoDocumentoMapper;
import com.sintad.backendpruebapractica.tipodocumento.domain.model.TipoDocumento;
import com.sintad.backendpruebapractica.tipodocumento.infrastructure.out.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoImpl implements TipoDocumentoService {

    @Autowired
    private final TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoImpl(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    @Override
    public List<TipoDocumentoDTO> findAll() {
        return TipoDocumentoMapper.instancia.listaTipoDocumentoATipoDocumentoDTO(tipoDocumentoRepository.findAll());
    }

    @Override
    public TipoDocumentoDTO findByID(long id) {
        Optional<TipoDocumento> tipoDocumentoOptional = tipoDocumentoRepository.findById(id);

        if (tipoDocumentoOptional.isPresent()) {
            return TipoDocumentoMapper.instancia.tipoDocumentoATipoDocumentoDTO(tipoDocumentoOptional.get());
        } else {
            throw new NoResultException("No se encontro el tipo de documento con id: " + id);
        }
    }

    @Override
    public TipoDocumentoDTO save(TipoDocumentoCreateDTO tipoDocumentoCreateDTO) {
        TipoDocumento tipoDocumento = TipoDocumentoMapper.instancia.tipoDocumentoCreateDTOATipoDocumento(tipoDocumentoCreateDTO);
        return TipoDocumentoMapper.instancia.tipoDocumentoATipoDocumentoDTO(tipoDocumentoRepository.save(tipoDocumento));
    }

    @Override
    public TipoDocumentoDTO update(TipoDocumentoUpdateDTO tipoDocumentoUpdateDTO) {
        TipoDocumento tipoDocumento = TipoDocumentoMapper.instancia.tipoDocumentoUpdateDTOATipoDocumento(tipoDocumentoUpdateDTO);
        return TipoDocumentoMapper.instancia.tipoDocumentoATipoDocumentoDTO(tipoDocumentoRepository.save(tipoDocumento));
    }

    @Override
    public void delete(long id) {

        Optional<TipoDocumento> tipoDocumentoOptional = tipoDocumentoRepository.findById(id);

        if (tipoDocumentoOptional.isPresent()) {
            tipoDocumentoRepository.delete(tipoDocumentoOptional.get());
        } else {
            throw new NoResultException("No se encontro el tipo de documento con id: " + id);
        }

    }
}
