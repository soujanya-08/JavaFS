package com.wipro.notifyms.repo;

import com.wipro.notifyms.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotifyRepo extends JpaRepository<Notification, Long> {
}
