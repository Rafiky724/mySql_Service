package com.co.jhonan.usuarios.service;

import java.util.Optional;

import com.co.jhonan.commons.service.CommonService;
import com.co.jhonan.usuarios.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
	
}
