package com.sji.si.notification_service.Repositories;

import com.sji.si.notification_service.Entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
    List<Notification> findAllByStatut(Boolean statut) ;
    Notification findNotificationById ( long id) ;
}