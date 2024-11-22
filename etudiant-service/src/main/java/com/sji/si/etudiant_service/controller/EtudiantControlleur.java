package com.sji.si.etudiant_service.controller;

import java.util.List;

import com.sji.si.etudiant_service.entity.Etudiant;
import com.sji.si.etudiant_service.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/etudiants")
@CrossOrigin(origins = "*")
public class EtudiantControlleur {

    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@RequestParam Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("/add")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        // TODO: process POST request

        return etudiantService.createEtudiant(etudiant);
    }

    @PutMapping("/update/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        // TODO: process PUT request

        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }
}

