package com.example.ooad.repositories;

import com.example.ooad.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User addUser(User u);
    User getUser(String userId);

}
