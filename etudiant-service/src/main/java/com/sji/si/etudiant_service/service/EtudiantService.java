package com.sji.si.etudiant_service.service;

import java.util.List;

import com.sji.si.etudiant_service.entity.Etudiant;
import com.sji.si.etudiant_service.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
