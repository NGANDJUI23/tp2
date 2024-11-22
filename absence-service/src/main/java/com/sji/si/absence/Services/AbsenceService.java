package com.sji.si.absence.Services;


import com.sji.si.absence.Entities.Absence;
import com.sji.si.absence.Repositories.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceService {
    @Autowired
    private AbsenceRepository absenceRepository;

    public Absence enregistrer_absence(Absence absence) {
        absence.setStatut(true);
        return absenceRepository.save(absence);
    }
    public List<Absence> liste_absence(){
        return absenceRepository.findAllByStatut(true);
    }
    public Absence modifier_absence(Absence absence) {
        return absenceRepository.save(absence);
    }
    public Boolean supprimer_absence(long id) {
        Absence a = absenceRepository.findAbsenceById(id);
        a.setStatut(false);
        absenceRepository.save(a);
        return true;
    }
    public List<Absence> getAbscenceEtudiant(Long idE){
        return absenceRepository.findAbsenceByIdEtudiant(idE);
    }
}
