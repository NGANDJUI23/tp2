package com.sji.si.absence.Repositories;

import com.sji.si.absence.Entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {

    List<Absence> findAllByStatut(Boolean statut) ;
    Absence findAbsenceById ( long id) ;
    
}