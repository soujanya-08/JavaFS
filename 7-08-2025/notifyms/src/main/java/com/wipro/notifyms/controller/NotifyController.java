package com.wipro.notifyms.controller;


import com.wipro.notifyms.dto.NotifyDTO;
import com.wipro.notifyms.repo.NotifyRepo;
import com.wipro.notifyms.entity.Notification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotifyController {

    private final NotifyRepo repository;

    public NotifyController(NotifyRepo repository) {
        this.repository = repository;
    }

    @PostMapping("/notify")
    public ResponseEntity<Void> notifyUser(@RequestBody NotifyDTO dto) {
        System.out.println("User " + dto.getUser().getUsername() + " information is " + dto.getAction());

        Notification n = new Notification();
        n.setUsername(dto.getUser().getUsername());
        n.setAction(dto.getAction());
        repository.save(n);

        return ResponseEntity.ok().build();
    }
}
