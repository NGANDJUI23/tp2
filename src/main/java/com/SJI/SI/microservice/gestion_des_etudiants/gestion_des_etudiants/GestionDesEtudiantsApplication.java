package com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionDesEtudiantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesEtudiantsApplication.class, args);
	}
}
