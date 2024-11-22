package com.sji.si.etudiant_service.repository;
import com.sji.si.etudiant_service.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EtudiantRepository extends JpaRepository <Etudiant, Long> {

}