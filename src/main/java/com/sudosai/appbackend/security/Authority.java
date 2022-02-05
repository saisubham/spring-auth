package com.sudosai.appbackend.security;

import org.springframework.security.core.GrantedAuthority;

public enum Authority implements GrantedAuthority {
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write"),
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write");

    private final String authority;

    Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
