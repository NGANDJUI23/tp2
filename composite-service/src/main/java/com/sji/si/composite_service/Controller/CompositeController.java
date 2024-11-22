package com.sji.si.composite_service.Controller;

import com.sji.si.composite_service.Service.CompositeService;
import com.sji.si.composite_service.models.Etudiant;
import com.sji.si.composite_service.models.EtudiantAvecDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/composite")
public class CompositeController {

    private final CompositeService compositeService;

    public CompositeController( CompositeService compositeService){
        this.compositeService = compositeService;
    }

    @GetMapping("/etudiants-avec-plus-abscences")
    public List<EtudiantAvecDetails> getEtudiantAvecPlusAbsences() {
        return compositeService.getEtudiantsAvesPlusAbsences();
    }

    @GetMapping("/etudiants-inscrits-absents")
    public List<Etudiant> getEtudiantsInscritsAbsents() {
        return compositeService.getEtudiantsAbsentsInscrits();
    }
}
