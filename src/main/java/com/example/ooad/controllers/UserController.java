package com.example.ooad.controllers;

import com.example.ooad.models.User;
import com.example.ooad.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
