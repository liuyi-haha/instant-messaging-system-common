package org.liuyi.common.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;

public class JwtUtil {
    private static final String SECRET = "mySimpleSecretKeyForJWT1234567890";

    // 生成 token
    public static String generateToken(String userId) {
        return Jwts.builder()
                .claim("userId", userId)
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8)))
                .compact();
    }

    // 解析 token 获取 userId
    public static String getUserId(String token) {
        try {
            var claims = Jwts.parserBuilder()
                    .setSigningKey(Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8)))
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.get("userId", String.class);
        } catch (Exception e) {
            return null;
        }
    }
}
