package com.sintad.backendpruebapractica.contribuyente.infrastructure.in;

import com.sintad.backendpruebapractica.contribuyente.application.service.TipoContribuyenteService;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteCreateDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteDTO;
import com.sintad.backendpruebapractica.contribuyente.domain.dto.TipoContribuyenteUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.List;

@RestController
@RequestMapping("/api/tipoContribuyentes")
public class TipoContribuyenteController {

    @Autowired
    private TipoContribuyenteService tipoContribuyService;

    @GetMapping("/")
    public ResponseEntity<List<TipoContribuyenteDTO>> listarTipoContribuyentes() {
        return new ResponseEntity<>(tipoContribuyService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarTipoContribuyente(@PathVariable(value = "id") long id) {
        try {
            return new ResponseEntity<>(tipoContribuyService.findByID(id), HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<TipoContribuyenteDTO> registrarTipoContribuyente(@RequestBody TipoContribuyenteCreateDTO tipoContribuyenteCreateDTO) {
        return new ResponseEntity<>(tipoContribuyService.save(tipoContribuyenteCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<TipoContribuyenteDTO> actualizarTipoContribuyente(@RequestBody TipoContribuyenteUpdateDTO tipoContribuyenteUpdateDTO) {
        return new ResponseEntity<>(tipoContribuyService.update(tipoContribuyenteUpdateDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTipoContribuyente(@PathVariable(value = "id") long id) {
        try {
            tipoContribuyService.delete(id);
            return new ResponseEntity<>("Se elimino el tipo de contribuyente con id:" + id, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
