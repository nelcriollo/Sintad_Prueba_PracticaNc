package com.sintad.backendpruebapractica.entidad.infrastructure.in;

import com.sintad.backendpruebapractica.entidad.application.service.EntidadService;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadCreateDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadDTO;
import com.sintad.backendpruebapractica.entidad.domain.dto.EntidadUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.List;

@RestController
@RequestMapping("/api/entidades")
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping("/")
    public ResponseEntity<List<EntidadDTO>> listarEntidades() {
        return new ResponseEntity<>(entidadService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarEntidad(@PathVariable(value = "id") long id) {
        try {
            return new ResponseEntity<>(entidadService.findByID(id), HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<EntidadDTO> registrarEntidad(@RequestBody EntidadCreateDTO entidadCreateDTO) {
        return new ResponseEntity<>(entidadService.save(entidadCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<EntidadDTO> actualizarEntidad(@RequestBody EntidadUpdateDTO entidadUpdateDTO) {
        return new ResponseEntity<>(entidadService.update(entidadUpdateDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEntidad(@PathVariable(value = "id") long id) {
        try {
            entidadService.delete(id);
            return new ResponseEntity<>("Se elimino la  entidad con id:" + id, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
