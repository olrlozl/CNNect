package com.ssafy.cnnect.oauth.jwt;

public enum JwtValidationType {
    VALID_JWT_TOKEN,              // 유효한 JWT
    INVALID_JWT_TOKEN,          // 유효하지 않은 토큰
    EXPIRED_JWT_TOKEN,          // 만료된 토큰
    UNSUPPORTED_JWT_TOKEN,      // 지원하지 않는 형식의 토큰
    EMPTY_JWT_TOKEN                   // 빈 JWT
}
