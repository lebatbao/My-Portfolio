package com.youtube.clone.controller;
import org.springframework.web.bind.annotation.*;
import com.youtube.clone.model.User;
import com.youtube.clone.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}