package org.example.pharmacy.infrastructure.repository;

import org.example.pharmacy.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for User entities.
 */
@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    /**
     * Finds a user by their username.
     * @param username The username to search for.
     * @return An Optional containing the UserEntity if found, otherwise empty.
     */
    Optional<UserEntity> findByUsername(String username);
}