package com.lio.moeduhouseapi.service.implementation;

import com.lio.moeduhouseapi.model.entity.User;
import com.lio.moeduhouseapi.service.interfaces.JwtProvider;
import org.springframework.stereotype.Service;

@Service("jwtProvider")
public class JwtProviderImpl implements JwtProvider {
    @Override
    public String generateToken(User user) {
        return null;
    }

    @Override
    public boolean isTokenValid(String token) {
        return false;
    }
}
