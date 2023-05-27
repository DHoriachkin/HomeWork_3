package com.example.vntu.homework_3.service;

import com.example.vntu.homework_3.entity.Token;
import org.springframework.stereotype.Service;

@Service
public class IntegrationServiceImpl implements IntegrationService {
    @Override
    public Token getUpstreamToken() {
        return Token.builder()
                .userName("smth")
                .authValue("0123456789abcdef")
                .destinationService("zi.vntu.edu.ua")
                .issueDate("February 21, 2021")
                .build();
    }
}
