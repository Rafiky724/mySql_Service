package com.co.jhonan.examenes.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.jhonan.commons.controller.CommonController;
import com.co.jhonan.commonsService.examen.models.entity.Examen;
import com.co.jhonan.examenes.services.ExamenService;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService>{

	@PutMapping("/examenes/{id}")
    public ResponseEntity<?> update(@RequestBody Examen examen, @PathVariable Long id) {
        Optional<Examen> optionalExamen = service.findById(id);

        if (!optionalExamen.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Examen examenDb = optionalExamen.get();
        examenDb.setNombre(examen.getNombre());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(examenDb));
    }
	
}
