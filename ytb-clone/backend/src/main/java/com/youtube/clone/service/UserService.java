package com.youtube.clone.service;

import org.springframework.stereotype.Service;
import com.youtube.clone.model.User;
import com.youtube.clone.repo.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }
}