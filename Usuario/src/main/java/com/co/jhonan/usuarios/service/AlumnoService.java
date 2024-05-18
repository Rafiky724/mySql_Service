package com.co.jhonan.usuarios.service;

import com.co.jhonan.commons.service.CommonService;
import com.co.jhonan.commonsService.usuario.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
	
}
