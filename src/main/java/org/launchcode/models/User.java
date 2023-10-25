package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    @NotEmpty(message = "Please entry a username that is between 5-15 characters.")
    @Size(min = 5, max = 15)
    private String username;
    @Email(message = "Please provide a valid email address.")
    private String email;
    @NotEmpty(message = "Please entry a password that is at least 6 characters or longer.")
    @Size (min = 6)
    private String password;

    public User() {}

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

