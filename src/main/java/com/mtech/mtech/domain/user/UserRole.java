package com.mtech.mtech.domain.user;

public enum UserRole {

    ADMIN("admin"),
    USER("user"),
    GESTOR("gestor");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}