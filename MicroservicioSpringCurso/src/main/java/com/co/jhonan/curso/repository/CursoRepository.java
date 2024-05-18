package com.co.jhonan.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.jhonan.commonsService.curso.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
