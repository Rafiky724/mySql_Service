package com.co.jhonan.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.jhonan.common.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
