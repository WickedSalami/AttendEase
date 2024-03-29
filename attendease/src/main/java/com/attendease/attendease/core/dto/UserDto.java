package com.attendease.attendease.core.dto;

import com.attendease.attendease.model.Role;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.Nullable;

public class UserDto {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @Nullable
    private int roleID = 0;

    public UserDto(String username, String firstname, String lastname, String email, String password, int roleID) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.roleID = roleID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
}
