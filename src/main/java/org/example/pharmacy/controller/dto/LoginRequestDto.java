package org.example.pharmacy.controller.dto;

public class LoginRequestDto {
    /**
     * The username for login.
     */
    private String username;
    /**
     * The password for login.
     */
    private String password;

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

    /**
     * Gets the password.
     * @return The password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}