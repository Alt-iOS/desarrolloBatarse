package com.mayab.desarrollo.estructural.proxy;

public class User {
    private boolean allowed;
    private String name;

    public User(boolean allowed, String name) {
        this.allowed = allowed;
        this.name = name;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
