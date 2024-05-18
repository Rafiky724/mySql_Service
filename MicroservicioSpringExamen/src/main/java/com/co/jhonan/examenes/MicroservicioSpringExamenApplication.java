package com.co.jhonan.examenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.jhonan.commonsService.models.entity","com.co.jhonan.examen.models.entity"})
@EnableJpaRepositories({"com.co.jhonan.commonsService.models.entity","com.co.jhonan.examen.models.entity"})
@EntityScan({"com.co.jhonan.commonsService.models.entity","com.co.jhonan.examen.models.entity"})
public class MicroservicioSpringExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioSpringExamenApplication.class, args);
	}

}
