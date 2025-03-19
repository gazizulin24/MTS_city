package org.gazizulin.auth_gateway.service;


import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.Jwts;
import org.gazizulin.auth_gateway.controller.dto.AuthenticationRequest;
import org.gazizulin.auth_gateway.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class JwtService {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    public String createJwtToken(String email) throws Exception {
        final UserDetails userDetails = userDetailsService.loadUserByUsername(email);
        return jwtUtil.generateToken(userDetails);
    }
}

