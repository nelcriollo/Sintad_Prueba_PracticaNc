package com.sintad.backendpruebapractica.entidad.application.impl;

import com.sintad.backendpruebapractica.entidad.application.service.EntidadService;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadCreateDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadUpdateDTO;
import com.sintad.backendpruebapractica.entidad.domain.mapper.EntidadMapper;
import com.sintad.backendpruebapractica.entidad.domain.model.Entidad;
import com.sintad.backendpruebapractica.entidad.infrastructure.out.EntidadRepository;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
public class EntidadImpl implements EntidadService {

    private final EntidadRepository entidadRepository;

    public EntidadImpl(EntidadRepository entidadRepository) {
        this.entidadRepository = entidadRepository;
    }


    @Override
    public List<EntidadDTO> findAll() {
        return EntidadMapper.instancia.listaEntidadesAEntidadesDTO(entidadRepository.findAll());
    }

    @Override
    public EntidadDTO findByID(long id) {
        Optional<Entidad> entidadOptional = entidadRepository.findById(id);

        if (entidadOptional.isPresent()) {
            return EntidadMapper.instancia.entidadAEntidadDTO(entidadOptional.get());
        } else {
            throw new NoResultException("No se encontro la entidad con id: " + id);
        }
    }

    @Override
    public EntidadDTO save(EntidadCreateDTO entidadCreateDTO) {
        Entidad entidad = EntidadMapper.instancia.entidadCreateDTOAEntidad(entidadCreateDTO);
        return EntidadMapper.instancia.entidadAEntidadDTO(entidadRepository.save(entidad));
    }

    @Override
    public EntidadDTO update(EntidadUpdateDTO entidadUpdateDTO) {
        Entidad entidad = EntidadMapper.instancia.entidadUpdateDTOAEntidad(entidadUpdateDTO);
        return EntidadMapper.instancia.entidadAEntidadDTO(entidadRepository.save(entidad));
    }

    @Override
    public void delete(long id) {
        Optional<Entidad> entidadOptional = entidadRepository.findById(id);

        if (entidadOptional.isPresent()) {
            entidadRepository.delete(entidadOptional.get());
        } else {
            throw new NoResultException("No se encontro la entidad con id: " + id);
        }
    }
}
