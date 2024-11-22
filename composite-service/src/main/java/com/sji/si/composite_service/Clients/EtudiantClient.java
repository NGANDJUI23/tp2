package com.sji.si.composite_service.Clients;

import com.sji.si.composite_service.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "EtudiantService", url ="http://localhost:8081/api/etudiants/")
public interface EtudiantClient {
    @GetMapping("/all")
    List<Etudiant> getAllEtudiants();

    @GetMapping("/{id}")
    Etudiant getEtudiantByIdE(@PathVariable Long id);
    
}
