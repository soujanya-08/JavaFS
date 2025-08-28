package com.wipro.userms.service;

import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepository) {
        this.userRepo = userRepository;
    }

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public Optional<User> getUser(Long id) {
        return userRepo.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
    	userRepo.deleteById(id);
    }
}