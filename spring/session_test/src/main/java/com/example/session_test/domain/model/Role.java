package com.example.session_test.domain.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER ("USER"),
    ADMIN ("ADMIN")

    ;
    String authority;

    Role(String auth) {
        this.authority = auth;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
