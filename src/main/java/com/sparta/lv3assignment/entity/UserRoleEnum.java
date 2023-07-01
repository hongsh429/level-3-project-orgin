package com.sparta.lv3assignment.entity;

public enum UserRoleEnum {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String authority;

    UserRoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}
