package com.co.jhonan.preguntas.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.jhonan.commons.controller.CommonController;
import com.co.jhonan.commonsService.pregunta.models.entity.Pregunta;
import com.co.jhonan.preguntas.services.PreguntaService;

@RestController
public class PreguntaController extends CommonController<Pregunta, PreguntaService>{

	@PutMapping("/preguntas/{id}")
    public ResponseEntity<?> update(@RequestBody Pregunta pregunta, @PathVariable Long id) {
        Optional<Pregunta> optionalPregunta = service.findById(id);

        if (!optionalPregunta.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Pregunta preguntaDb = optionalPregunta.get();
        preguntaDb.setTexto(pregunta.getTexto()); 

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(preguntaDb));
    }
}
