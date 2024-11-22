package com.sji.si.inscription_service.Repositories;

import com.sji.si.inscription_service.Entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    List<Inscription> findAllByStatut(Boolean statut);
    Inscription findInscriptionById (Long id);
    List<Inscription> findByIdEtudiant(Long idE);
}