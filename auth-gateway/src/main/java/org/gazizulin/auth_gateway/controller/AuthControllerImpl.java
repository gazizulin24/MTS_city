package org.gazizulin.auth_gateway.controller;

import org.gazizulin.auth_gateway.controller.dto.AuthenticationRequest;
import org.gazizulin.auth_gateway.controller.dto.AuthenticationResponse;
import org.gazizulin.auth_gateway.model.User;
import org.gazizulin.auth_gateway.service.JwtService;
import org.gazizulin.auth_gateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthControllerImpl implements AuthController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @Override
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        final String jwt = jwtService.createJwtToken(authenticationRequest.getEmail());
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws Exception {
        final String jwt = userService.save(user);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}

