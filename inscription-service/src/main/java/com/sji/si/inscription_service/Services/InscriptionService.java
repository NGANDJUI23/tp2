package com.sji.si.inscription_service.Services;

import com.sji.si.inscription_service.Entities.Inscription;
import com.sji.si.inscription_service.Repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    public Inscription enregistrer_inscription(Inscription inscription) {
        inscription.setStatut(true);
        return inscriptionRepository.save(inscription);
    }
    public List<Inscription> getAllInscripEtudiant(Long idE){
        return inscriptionRepository.findByIdEtudiant(idE);
    }

    public List<Inscription> liste_inscription(){
        return inscriptionRepository.findAllByStatut(true);
    }
    //    public List<Inscription> getByStatut(){
    //        return inscriptionRepository.findAllByStatut(true);
    //    }
    public Inscription modifier_inscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }
    public Boolean supprimer_inscription(long id) {
        Inscription a = inscriptionRepository.findInscriptionById(id);
        a.setStatut(false);
        inscriptionRepository.save(a);
        return true;
    }
}
