package com.sji.si.composite_service.Clients;

import com.sji.si.composite_service.models.Inscription;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "InscriptionService", url = "http://localhost:8082/api/inscription/")
public interface InscriptionClient {

    @GetMapping("/list")
    List<Inscription> getAllInscriptions();

    @GetMapping("/etudiant/{idE}")
    List<Inscription> getInscriptionsByIdE(@PathVariable Long idE);
    
}
