package com.sji.si.inscription_service.Controlleurs;

import com.sji.si.inscription_service.Entities.Inscription;
import com.sji.si.inscription_service.Services.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/inscription")
@CrossOrigin(origins = "*")
public class InscriptionControlleur {

    @Autowired
    private InscriptionService inscriptionService;


    @PostMapping("/save")
    public Map<String,Object> save (@RequestBody Inscription inscription)
    {
        Inscription result = inscriptionService.enregistrer_inscription(inscription);
        Map<String,Object> response = new HashMap<>();
        if(result==null ){
            response.put("message","echec de l'enregistrement");
            response.put("success",false);

        }else {
            response.put("message","enregistrement reussi");
            response.put("success",true);
        }
        return response;
    }

    @PostMapping("/update")
    public Map<String,Object> modifier (@RequestBody Inscription inscription)
    {
        Inscription result = inscriptionService.modifier_inscription(inscription);
        Map<String,Object> response = new HashMap<>();
        if(result==null ){
            response.put("message","echec de la modification");
            response.put("success",false);

        }else {
            response.put("message","modification reussi");
            response.put("success",true);
        }
        return response;
    }


    @GetMapping("/delete/{id}")
    public Map<String,Object> delete (@PathVariable Integer id)
    {
        Boolean result = inscriptionService.supprimer_inscription(id);
        Map<String,Object> response = new HashMap<>();
        if(result==null ){
            response.put("message","echec de la suppression");
            response.put("success",false);

        }else {
            response.put("message","suppression reussi");
            response.put("success",true);
        }
        return response;
    }

    @GetMapping("/list")
    public List<Inscription> list ()
    {
        List<Inscription> result = inscriptionService.liste_inscription();
        Map<String,Object> response = new HashMap<>();
//        if(result==null ){
//            response.put("message","echec de l'envoie de la liste");
//            response.put("success",false);
//
//        }else {
//            response.put("message","envoie de la liste reussi");
//            response.put("success",true);
//            response.put("list",result);
//        }
        return result;
    }
    @GetMapping("/etudiant/{idE}")
    private List<Inscription> getAllInscripEtudiant(@PathVariable Long idE){
        return inscriptionService.getAllInscripEtudiant(idE);
    }

}
