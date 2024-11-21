package com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.models.Etudiant;

public interface EtudiantRepository extends JpaRepository <Etudiant, Long> {
    
}
