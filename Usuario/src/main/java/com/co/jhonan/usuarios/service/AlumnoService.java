package com.co.jhonan.usuarios.service;

import java.util.Optional;

import com.co.jhonan.common.usuario.models.entity.Alumno;
import com.co.jhonan.commons.service.CommonService;

public interface AlumnoService extends CommonService<Alumno> {
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
	
}
