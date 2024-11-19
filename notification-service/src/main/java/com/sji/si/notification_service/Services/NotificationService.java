package com.sji.si.notification_service.Services;

import com.sji.si.notification_service.Entities.Notification;
import com.sji.si.notification_service.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification enregistrer_notification(Notification notification) {
        notification.setStatut(true);
        return notificationRepository.save(notification);
    }
    public List<Notification> liste_notification(){
        return notificationRepository.findAllByStatut(true);
    }
    public Notification modifier_notification(Notification notification) {
        return notificationRepository.save(notification);
    }
    public Boolean supprimer_notification(long id) {
        Notification notify = notificationRepository.findNotificationById(id);
        notify.setStatut(false);
        notificationRepository.save(notify);
        return true;
    }
}
