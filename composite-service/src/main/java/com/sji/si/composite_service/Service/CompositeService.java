package com.sji.si.composite_service.Service;


import com.sji.si.composite_service.Clients.AbsenceClient;
import com.sji.si.composite_service.Clients.EtudiantClient;
import com.sji.si.composite_service.Clients.InscriptionClient;
import com.sji.si.composite_service.models.Absence;
import com.sji.si.composite_service.models.Etudiant;
import com.sji.si.composite_service.models.EtudiantAvecDetails;
import com.sji.si.composite_service.models.Inscription;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CompositeService {

    private final EtudiantClient etudiantClient;
    private final AbsenceClient absenceClient;
    private final InscriptionClient inscriptionClient;




    public List<EtudiantAvecDetails> getEtudiantsAvesPlusAbsences(){
        List<Etudiant> etudiants = etudiantClient.getAllEtudiants();
        List<Absence> absences = absenceClient.getAllAbsences();

         // Map studentId to absence count
        Map<Long, Long> absenceCountMap = absences.stream()
            .collect(Collectors.groupingBy(Absence::getIdE, Collectors.counting()));

             // Combine student info with absence count
        return etudiants.stream()
        .filter(etudiant -> absenceCountMap.containsKey(etudiant.getId()))
         .map(etudiant -> new EtudiantAvecDetails(
             etudiant.getId(),
             etudiant.getName(),
             absenceCountMap.get(etudiant.getId())
         ))
         .sorted(Comparator.comparing(EtudiantAvecDetails::getAbsenceCount).reversed())
         .collect(Collectors.toList());

    }

    public List<Etudiant> getEtudiantsAbsentsInscrits() {
        // Récupérer toutes les inscriptions
        List<Inscription> inscriptions = inscriptionClient.getAllInscriptions();

        // Trouver les étudiants ayant des absences
        Set<Long> absentStudentIds = inscriptions.stream()
                .map(Inscription::getIdE)
                .filter(studentId -> !absenceClient.getAbsencesById(studentId).isEmpty())
                .collect(Collectors.toSet());

        // Récupérer les informations des étudiants inscrits qui sont absents
        return absentStudentIds.stream()
                .map(etudiantClient:: getEtudiantByIdE)
                .collect(Collectors.toList());
    }



}
