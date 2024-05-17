package com.co.jhonan.respuestas.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.co.jhonan.common.respuesta.models.entity.Respuesta;
import com.co.jhonan.commons.controller.CommonController;
import com.co.jhonan.respuestas.services.RespuestaService;

public class RespuestaController extends CommonController<Respuesta, RespuestaService>{

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Respuesta respuesta, @PathVariable Long id){
		Optional<Respuesta> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Respuesta respuestaBd = ob.get();
		respuestaBd.setTexto(respuesta.getTexto());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service);
		
	}
}
