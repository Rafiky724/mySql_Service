package com.co.jhonan.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.jhonan.common.usuario.models.entity","com.co.jhonan.curso.models.entity","com.co.jhonan.respuesta.models.entity"})
@EnableJpaRepositories({"com.co.jhonan.common.usuario.models.entity","com.co.jhonan.curso.models.entity","com.co.jhonan.respuesta.models.entity"})
public class MicroservicioSpringRespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSpringRespuestasApplication.class, args);
	}

}
