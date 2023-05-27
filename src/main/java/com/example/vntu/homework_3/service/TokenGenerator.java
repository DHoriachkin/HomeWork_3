package com.example.vntu.homework_3.service;

import com.example.vntu.homework_3.entity.Token;

public interface TokenGenerator {
    Token generate(Token upstreamToken);
}
