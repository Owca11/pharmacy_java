package org.example.pharmacy.controller.dto;

public class UserResponseDto {
    /**
     * Unique identifier of the user.
     */
    private long id;
    /**
     * The username of the user.
     */
    private String username;

    /**
     * Constructs a new UserResponseDto with the specified ID and username.
     * @param id The unique identifier of the user.
     * @param username The username of the user.
     */
    public UserResponseDto(long id, String username) {
        this.id = id;
        this.username = username;
    }

    /**
     * Gets the unique identifier of the user.
     * @return The user ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the user.
     * @param id The user ID to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the username.
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * @param username The username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }
}