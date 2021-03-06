package com.better_systematic_review.model;

public class Review {
    private String name;
    private String id;
    private String lastLogin;

    public Review(String name, String id, String lastLogin) {
        this.name = name;
        this.id = id;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}
