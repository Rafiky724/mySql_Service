package com.co.jhonan.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.jhonan.commons.controller.CommonController;
import com.co.jhonan.commonsService.curso.models.entity.Curso;
import com.co.jhonan.commonsService.usuario.models.entity.Alumno;
import com.co.jhonan.curso.services.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService>{

	@PutMapping("/{id}/asignar-alumno")
	public ResponseEntity<?> asignarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id){
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		alumno.forEach(a -> {
			cursoBd.addAlumnos(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
		
	}
	
	@PutMapping("/{id}/eliminar-alumno")
	public ResponseEntity<?> eliminarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id){
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		
		cursoBd.removeAlumno(alumno);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
		
	}
}
