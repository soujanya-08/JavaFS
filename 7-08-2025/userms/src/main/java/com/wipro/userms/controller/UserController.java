package com.wipro.userms.controller;

import com.wipro.userms.dto.NotificationDTO;
import com.wipro.userms.dto.UserDTO;
import com.wipro.userms.entity.User;
import com.wipro.userms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final RestTemplate restTemplate;

    private final String notificationUrl = "http://localhost:9020/notify";

    @Autowired
    public UserController(UserService userService, RestTemplate restTemplate) {
        this.userService = userService;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        notify(savedUser, "Created");
        return ResponseEntity.ok(savedUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        User updatedUser = userService.saveUser(user);
        notify(updatedUser, "Updated");
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

        User dummy = new User();
        dummy.setId(id);
        dummy.setUsername("user-" + id);

        notify(dummy, "Deleted");
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    private void notify(User user, String action) {
        UserDTO dto = new UserDTO();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setAddress(user.getAddress());

        NotificationDTO notification = new NotificationDTO();
        notification.setUser(dto);
        notification.setAction(action);

        restTemplate.postForEntity(notificationUrl, notification, Void.class);
    }
}
