package org.example.pharmacy.controller.dto;

public class UserResponseDto {

    public UserResponseDto(long id, String username) {
        this.id = id;
        this.username = username;
    }

    private long id;
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}