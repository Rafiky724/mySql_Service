package com.co.jhonan.examenes.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.jhonan.commonsService.examen.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

}
