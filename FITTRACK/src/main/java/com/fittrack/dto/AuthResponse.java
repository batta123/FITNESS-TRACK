package com.fittrack.dto;

public class AuthResponse {
    private String jwtToken;

    public AuthResponse(String jwtToKen) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
