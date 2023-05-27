package com.example.vntu.homework_3.service;

import com.example.vntu.homework_3.entity.Token;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class TokenGeneratorImpl implements TokenGenerator {
    private final AtomicLong tokenNumber = new AtomicLong(0);

    private final DateFormatConverter dateFormatConverter;

    public TokenGeneratorImpl(DateFormatConverter dateFormatConverter) {
        this.dateFormatConverter = dateFormatConverter;
    }

    @Override
    public Token generate(Token upstreamToken) {
        return Token.builder()
                .tokenId(tokenNumber.incrementAndGet())
                .authValue(upstreamToken.getAuthValue())
                .userName(upstreamToken.getUserName())
                .issueDate(dateFormatConverter.convertDate(upstreamToken.getIssueDate()))
                .build();
    }
}
