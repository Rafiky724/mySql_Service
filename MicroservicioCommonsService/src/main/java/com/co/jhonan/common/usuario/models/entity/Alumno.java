package com.co.jhonan.common.usuario.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
@Table
public class Alumno {
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Alumno)) {
			return false;
		}
		
		Alumno a = (Alumno) obj;
		
		return this.Id != null && this.Id.equals(a.getId());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@PrePersist
	private void prePersist() {
		this.createAt = new Date();
	}
	
	public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
	
	@Override
    public String toString() {
        return "Alumno{" +
                "id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", createAt=" + createAt +
                '}';
    }

}
