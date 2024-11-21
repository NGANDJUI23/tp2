package com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.Service.EtudiantService;
import com.SJI.SI.microservice.gestion_des_etudiants.gestion_des_etudiants.models.Etudiant;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping()
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@RequestParam Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("/a")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        // TODO: process POST request

        return etudiantService.createEtudiant(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        // TODO: process PUT request

        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }

}
