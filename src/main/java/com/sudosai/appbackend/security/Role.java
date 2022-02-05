package com.sudosai.appbackend.security;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(
            Authority.COURSE_WRITE,
            Authority.COURSE_READ,
            Authority.STUDENT_READ,
            Authority.STUDENT_WRITE)),
    USER(Set.of());

    private final Set<Authority> authorities;

    Role(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }
}
