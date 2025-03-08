package com.techstore.techstore.service;

import com.techstore.techstore.DAO.UserRepository;
import com.techstore.techstore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    private UserRepository repo;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User register(User user) {
        user.setPasswordUser(encoder.encode(user.getPasswordUser()));
        repo.save(user);
        return user;
    }

    public String verify(User user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmailUser(), user.getPasswordUser()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getEmailUser());
        } else {
            return "fail";
        }
    }
}