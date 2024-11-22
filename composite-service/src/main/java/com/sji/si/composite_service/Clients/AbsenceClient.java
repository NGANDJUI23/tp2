package com.sji.si.composite_service.Clients;


import com.sji.si.composite_service.models.Absence;
import com.sji.si.composite_service.models.Etudiant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "AbsenceService", url ="http://localhost:8084/api/absence")
public interface AbsenceClient {
    @GetMapping("/list")
    List<Absence> getAllAbsences();

    @GetMapping("/etudiant/{idE}")
    Etudiant getAbsencesById(@PathVariable Long idE);
}
