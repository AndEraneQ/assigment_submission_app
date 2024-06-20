package com.myApp.AssignmentSubmissionApp.security.jwt;

import com.myApp.AssignmentSubmissionApp.domain.User;

import java.time.LocalDate;
import java.util.List;

public class JwtResponse {
    private Long id;
    private String token;
    private String type = "Bearer";
    private String username;
    private LocalDate cohortStartDate;
    private List<String> roles;

    public User toUser(){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setCohortStartDate(cohortStartDate);
        return user;
    }

    public JwtResponse(String token, Long id, String username, LocalDate cohortStartDate, List<String> roles) {
        this.id = id;
        this.token = token;
        this.username = username;
        this.cohortStartDate = cohortStartDate;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getCohortStartDate() {
        return cohortStartDate;
    }

    public void setCohortStartDate(LocalDate cohortStartDate) {
        this.cohortStartDate = cohortStartDate;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
