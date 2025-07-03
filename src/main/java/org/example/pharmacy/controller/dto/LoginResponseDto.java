package org.example.pharmacy.controller.dto;

public class LoginResponseDto {
    /**
     * The authentication token.
     */
    private String token;

    /**
     * Constructs a new LoginResponseDto with the specified token.
     * @param token The authentication token.
     */
    public LoginResponseDto(String token) {
        this.token = token;
    }

    /**
     * Gets the authentication token.
     * @return The token.
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the authentication token.
     * @param token The token to set.
     */
    public void setToken(String token) {
        this.token = token;
    }
}