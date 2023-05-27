package com.example.vntu.homework_3.controller;

import com.example.vntu.homework_3.entity.Token;
import com.example.vntu.homework_3.service.TokenMediator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
    private final TokenMediator tokenMediator;

    public TokenController(TokenMediator tokenMediator) {
        this.tokenMediator = tokenMediator;
    }

    @GetMapping(value = "/gettoken")
    public ResponseEntity<Token> getToken() {
        Token token = tokenMediator.requestToken();
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

}
