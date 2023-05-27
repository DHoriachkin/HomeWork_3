package com.example.vntu.homework_3.service;

import com.example.vntu.homework_3.entity.Token;
import org.springframework.stereotype.Service;

@Service
public class TokenMediatorImpl implements TokenMediator {
    private final IntegrationService integrationService;
    private final TokenGenerator tokenGenerator;

    public TokenMediatorImpl(IntegrationService integrationService, TokenGenerator tokenGenerator) {
        this.integrationService = integrationService;
        this.tokenGenerator = tokenGenerator;
    }

    @Override
    public Token requestToken() {
        Token upstreamToken = integrationService.getUpstreamToken();
        return tokenGenerator.generate(upstreamToken);
    }
}
