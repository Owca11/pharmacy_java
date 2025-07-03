package org.example.pharmacy.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.example.pharmacy.infrastructure.entity.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

/**
 * Service for JWT (JSON Web Token) operations.
 */
@Service
public class JwtService {
    @Value("${security.token.validity}")
    private long JWT_VALIDITY;

    @Value("${security.token.secret}")
    private String SECRET_KEY;

    /**
     * Creates a new JWT for the given user.
     * @param user The user entity for whom the token is created.
     * @return The generated JWT string.
     */
    public String createToken(UserEntity user) {
        long now = System.currentTimeMillis();

        return Jwts.builder()
                .subject(user.getUsername())
                .claim("id", user.getId())
                .issuedAt(new Date(now))
                .expiration(new Date(now + JWT_VALIDITY))
                .signWith(generateKey())
                .compact();
    }

    /**
     * Verifies the validity of a given JWT.
     * @param token The JWT string to verify.
     * @return True if the token is valid, false otherwise.
     */
    public boolean verifyToken(String token) {
        return !isTokenExpired(token);
    }

    /**
     * Checks if a token is expired.
     * @param token The JWT string.
     * @return True if the token is expired, false otherwise.
     */
    private boolean isTokenExpired(String token) {
        return getExpirationDate(token).before(new Date());
    }

    /**
     * Extracts the username from a JWT.
     * @param token The JWT string.
     * @return The username.
     */
    public String getUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     * Extracts the expiration date from a JWT.
     * @param token The JWT string.
     * @return The expiration Date.
     */
    public Date getExpirationDate(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    /**
     * Extracts all claims from a JWT.
     * @param token The JWT string.
     * @return All claims as a Claims object.
     */
    private Claims extractAllClaims(String token) {
        return Jwts.parser().verifyWith(generateKey()).build().parseSignedClaims(token).getPayload();
    }

    /**
     * Extracts a specific claim from a JWT using a claims resolver function.
     * @param token The JWT string.
     * @param claimsResolver Function to resolve the specific claim.
     * @param <T> The type of the claim.
     * @return The extracted claim.
     */
    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final var claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     * Generates a SecretKey from the base64 encoded secret key string.
     * @return The generated SecretKey.
     */
    private SecretKey generateKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }
}