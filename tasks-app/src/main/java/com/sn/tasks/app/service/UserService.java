package com.sn.tasks.app.service;

import com.sn.tasks.app.model.User;
import com.sn.tasks.app.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser (User user) {
        userRepo.save(user);
        return user;
    }

}

