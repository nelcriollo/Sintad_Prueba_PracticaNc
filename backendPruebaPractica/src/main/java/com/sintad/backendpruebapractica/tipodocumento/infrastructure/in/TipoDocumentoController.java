package com.sintad.backendpruebapractica.tipodocumento.infrastructure.in;

import com.sintad.backendpruebapractica.tipodocumento.application.service.TipoDocumentoService;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoCreateDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoDTO;
import com.sintad.backendpruebapractica.tipodocumento.domain.dto.TipoDocumentoUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.List;

@RestController
@RequestMapping("/api/tipodocumentos")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/")
    public ResponseEntity<List<TipoDocumentoDTO>> listarTipoDocumentos() {
        return new ResponseEntity<>(tipoDocumentoService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarTipoDocumento(@PathVariable(value = "id") long id) {
        try {
            return new ResponseEntity<>(tipoDocumentoService.findByID(id), HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<TipoDocumentoDTO> registrarTipoDocumento(@RequestBody TipoDocumentoCreateDTO tipoDocumentoCreateDTO) {
        return new ResponseEntity<>(tipoDocumentoService.save(tipoDocumentoCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<TipoDocumentoDTO> actualizarTipoDocumento(@RequestBody TipoDocumentoUpdateDTO tipoDocumentoUpdateDTO) {
        return new ResponseEntity<>(tipoDocumentoService.update(tipoDocumentoUpdateDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTipoDocumento(@PathVariable(value = "id") long id) {
        try {
            tipoDocumentoService.delete(id);
            return new ResponseEntity<>("Se elimino el tipo de documento con id:" + id, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
