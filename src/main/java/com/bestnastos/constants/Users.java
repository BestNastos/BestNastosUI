package com.bestnastos.constants;

public enum Users {

    PITER_CHAILOVSKII("epam", "1234");

    private String username;
    private String password;

    Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
