package org.gazizulin.auth_gateway.service;


import org.gazizulin.auth_gateway.model.User;
import org.gazizulin.auth_gateway.repositiory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String save(User user) throws Exception {
        User userFound = userRepository.findByEmail(user.getEmail());
        if (userFound != null && userFound.getEmail().equals(user.getEmail()) ) {
            throw new Exception("Email already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);

        return jwtService.createJwtToken(savedUser.getEmail());
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

