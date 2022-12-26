package com.example.ooad.service;

import com.example.ooad.models.User;
import com.example.ooad.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.addUser(user);
    }

    public User getUserById(String userId){
        return userRepository.getUser(userId);
    }

}
