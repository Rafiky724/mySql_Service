package com.co.jhonan.preguntas.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.jhonan.commonsService.pregunta.models.entity.Pregunta;

public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {

}
