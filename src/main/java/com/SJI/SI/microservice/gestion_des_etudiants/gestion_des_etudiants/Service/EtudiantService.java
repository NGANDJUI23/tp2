package com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.models.Etudiant;
import com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.repository.EtudiantRepository;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants(){
        return etudiantRepository.findAll();
    }

    public Etudiant getEtudiantById(Long id){
        return etudiantRepository.findById(id).orElseThrow();
    }

    public Etudiant createEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(Long id){
        etudiantRepository.deleteById(id);
    }
}
