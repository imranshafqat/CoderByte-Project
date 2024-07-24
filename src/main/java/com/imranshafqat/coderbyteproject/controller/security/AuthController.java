package com.imranshafqat.coderbyteproject.controller.security;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imranshafqat.coderbyteproject.service.security.TokenService;

@RestController
@RequestMapping("/api/v1/")
public class AuthController {

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("token")
    public String token(Authentication authentication) {
        String token = tokenService.generateToken(authentication);
        return token;
    }

}
