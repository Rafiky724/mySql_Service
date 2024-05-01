package com.co.jhonan.commons.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.co.jhonan.commons.service.CommonService;

public class CommonController <E, S extends CommonService<E>> {

	@Autowired
	protected S service;
	
	@Value("${config.balanceador.test}")
	protected String balanceadorTest;
	
	@GetMapping("/balanceador-test")
	public ResponseEntity<?> balanceadorTest(){
		Map<String, Object> response = new HashMap<String, Object>(); //posible error
		response.put("balanceador", balanceadorTest);
		response.put("alumno", service.findAll());
				
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/lista/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id){
		
		Optional<E> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok().body(ob.get());
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody E entity){
		E entityDb = service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
	}
	
	 @DeleteMapping("/{id}")
	 private ResponseEntity<?> eliminar(@PathVariable Long id){
		
		 service.deleteById(id);
		 return ResponseEntity.noContent().build();
	}
	
}
