package org.example.pharmacy.controller.dto;

public class CreateUserResponseDto {
    /**
     * Unique identifier of the created user.
     */
    private long id;

    /**
     * Constructs a new CreateUserResponseDto with the specified user ID.
     * @param id The unique identifier of the user.
     */
    public CreateUserResponseDto(long id) {
        this.id = id;
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
}