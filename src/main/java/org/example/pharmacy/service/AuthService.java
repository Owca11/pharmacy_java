package org.example.pharmacy.service;

import org.example.pharmacy.controller.dto.LoginRequestDto;
import org.example.pharmacy.controller.dto.LoginResponseDto;
import org.example.pharmacy.infrastructure.repository.IUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Service for user authentication.
 */
@Service
public class AuthService {
    private final IUserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    /**
     * Constructs an AuthService with necessary dependencies.
     * @param userRepository The user repository.
     * @param jwtService The JWT service.
     * @param passwordEncoder The password encoder.
     */
    public AuthService(IUserRepository userRepository, JwtService jwtService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Authenticates a user and returns a login response.
     * @param loginRequestDto The login request containing username and password.
     * @return A LoginResponseDto with the authentication token.
     * @throws RuntimeException if user is not found or password does not match.
     */
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        var user = userRepository.findByUsername(loginRequestDto.getUsername()).orElseThrow(() -> new RuntimeException("User not found"));

        var doPasswordMatch = passwordEncoder.matches(loginRequestDto.getPassword(), user.getPassword());

        if(!doPasswordMatch) {
            throw new RuntimeException("Unauthorized");
        }

        return new LoginResponseDto(jwtService.createToken(user));
    }
}