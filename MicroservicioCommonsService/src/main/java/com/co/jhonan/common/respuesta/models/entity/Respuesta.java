package com.co.jhonan.common.respuesta.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="respuestas")
public class Respuesta {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String texto;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
        this.id = id;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
	
    
    @Override
    public String toString() {
        return "Respuesta{" +
                "id=" + id +
                ", nombre='" + texto +
                '}';
    }

	
}