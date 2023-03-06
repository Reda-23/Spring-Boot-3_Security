package org.accountssecurity.dto;

import java.util.Date;

public class AccountRequest {

    private Long id;
    private String username;
    private String password;
    private String role;
    private Date date;
    private String fullName;

    public AccountRequest(Long id, String username, String password, String role, Date date, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.date = date;
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
