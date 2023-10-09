package com.sintad.backendpruebapractica.contribuyente.application.impl;

import com.sintad.backendpruebapractica.contribuyente.application.service.TipoContribuyenteService;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteCreateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteUpdateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.mapper.TipoContribuyenteMapper;
import com.sintad.backendpruebapractica.contribuyente.domain.model.TipoContribuyente;
import com.sintad.backendpruebapractica.contribuyente.infrastructure.out.TipoContribuyenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
public class TipoContribuyenteImpl  implements TipoContribuyenteService {

    @Autowired
    private final TipoContribuyenteRepository tipoContribuyenteRepository;

    public TipoContribuyenteImpl(TipoContribuyenteRepository tipoContribuyenteRepository) {
        this.tipoContribuyenteRepository = tipoContribuyenteRepository;
    }


    @Override
    public List<TipoContribuyenteDTO> findAll() {
        return TipoContribuyenteMapper.instancia.listaTipoContribuyenteATipoContribuyenteDTO(tipoContribuyenteRepository.findAll());
    }

    @Override
    public TipoContribuyenteDTO findByID(long id) {
        Optional<TipoContribuyente> tipoContribuyenteOptional = tipoContribuyenteRepository.findById(id);

        if (tipoContribuyenteOptional.isPresent()) {
            return TipoContribuyenteMapper.instancia.tipoContributesATipoContribuyenteDTO(tipoContribuyenteOptional.get());
        } else {
            throw new NoResultException("No se encontro el tipo de contribuyente con id: " + id);
        }
    }

    @Override
    public TipoContribuyenteDTO save(TipoContribuyenteCreateDTO tipoContribuyenteCreateDTO) {
        TipoContribuyente tipoContribuyente = TipoContribuyenteMapper.instancia.tipoContribuyenteCreateDTOATipoContribuyente(tipoContribuyenteCreateDTO);
        return TipoContribuyenteMapper.instancia.tipoContributesATipoContribuyenteDTO(tipoContribuyenteRepository.save(tipoContribuyente));
    }

    @Override
    public TipoContribuyenteDTO update(TipoContribuyenteUpdateDTO tipoContribuyenteUpdateDTO) {
        TipoContribuyente tipoContribuyente = TipoContribuyenteMapper.instancia.tipoContribuyenteUpdateDTOATipoContribuyente(tipoContribuyenteUpdateDTO);
        return TipoContribuyenteMapper.instancia.tipoContributesATipoContribuyenteDTO(tipoContribuyenteRepository.save(tipoContribuyente));
    }

    @Override
    public void delete(long id) {
        Optional<TipoContribuyente> tipoContribuyenteOptional = tipoContribuyenteRepository.findById(id);

        if (tipoContribuyenteOptional.isPresent()) {
             tipoContribuyenteRepository.delete(tipoContribuyenteOptional.get());
        } else {
            throw new NoResultException("No se encontro el tipo de contribuyente con id: " + id);
        }
    }
}
