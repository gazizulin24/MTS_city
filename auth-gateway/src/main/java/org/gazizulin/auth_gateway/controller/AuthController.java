package org.gazizulin.auth_gateway.controller;


import org.gazizulin.auth_gateway.controller.dto.AuthenticationRequest;
import org.gazizulin.auth_gateway.controller.dto.AuthenticationResponse;
import org.gazizulin.auth_gateway.model.User;
import org.springframework.http.ResponseEntity;

public interface AuthController {

    /**
     * @param authenticationRequest
     * @return ResponseEntity
     * @throws Exception
     */
    ResponseEntity<?> createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception;
    /**
     * @param user
     * @return ResponseEntity
     * @throws Exception
     */
    ResponseEntity<?> registerUser(User user) throws Exception;

}
