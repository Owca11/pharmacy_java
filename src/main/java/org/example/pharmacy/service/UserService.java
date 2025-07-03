package org.example.pharmacy.service;

import org.example.pharmacy.controller.dto.CreateUserRequestDto;
import org.example.pharmacy.controller.dto.CreateUserResponseDto;
import org.example.pharmacy.controller.dto.UserResponseDto;
import org.example.pharmacy.infrastructure.entity.UserEntity;
import org.example.pharmacy.infrastructure.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Service for managing user-related operations.
 */
@Service
public class UserService {
    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * Constructs a UserService with the given UserRepository and PasswordEncoder.
     * @param userRepository The user repository.
     * @param passwordEncoder The password encoder.
     */
    @Autowired
    public UserService(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    /**
     * Creates a new user.
     * @param userDto The CreateUserRequestDto containing user information.
     * @return A CreateUserResponseDto for the created user.
     */
    public CreateUserResponseDto createUser(CreateUserRequestDto userDto) {
        var userEntity = new UserEntity();

        var hashedPassword = passwordEncoder.encode(userDto.getPassword());

        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(hashedPassword);
        var savedUser = userRepository.save(userEntity);

        return new CreateUserResponseDto(savedUser.getId());
    }

    /**
     * Retrieves a user by their ID.
     * @param id The ID of the user.
     * @return The UserResponseDto representing the user.
     * @throws RuntimeException if the user is not found.
     */
    public UserResponseDto getUser(long id) {
        var user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return new UserResponseDto(user.getId(), user.getUsername());
    }
}