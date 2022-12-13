package com.lio.moeduhouseapi.service.interfaces;

import com.lio.moeduhouseapi.model.entity.User;

public interface JwtProvider {
    String generateToken(User user);
    boolean isTokenValid(String token);
}
