package com.sji.si.notification_service.Controlleurs;

import com.sji.si.notification_service.Entities.Notification;
import com.sji.si.notification_service.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/notification")
public class NotificationControlleur {
    @Autowired
    private NotificationService notificationService;


    @PostMapping("/save")
    public Map<String,Object> save (@RequestBody Notification notification)
    {
        Notification result = notificationService.enregistrer_notification(notification);
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
    public Map<String,Object> modifier (@RequestBody Notification notification)
    {
        Notification result = notificationService.modifier_notification(notification);
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


    @PostMapping("/delete")
    public Map<String,Object> delete (@RequestBody Integer id)
    {
        Boolean result = notificationService.supprimer_notification(id);
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

    @PostMapping("/list")
    public Map<String,Object> list ()
    {
        List<Notification> result = notificationService.liste_notification();
        Map<String,Object> response = new HashMap<>();
        if(result==null ){
            response.put("message","echec de l'envoie de la liste");
            response.put("success",false);

        }else {
            response.put("message","envoie de la liste reussi");
            response.put("success",true);
            response.put("list",result);
        }
        return response;
    }
}
