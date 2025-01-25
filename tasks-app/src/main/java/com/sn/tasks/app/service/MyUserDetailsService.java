package com.sn.tasks.app.service;

import com.sn.tasks.app.pgsql.model.User;
import com.sn.tasks.app.pgsql.model.UserPrincipal;
import com.sn.tasks.app.pgsql.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);
        if(user == null) {
            System.out.println("User was not found");
        }

        return new UserPrincipal(user);
    }
}
