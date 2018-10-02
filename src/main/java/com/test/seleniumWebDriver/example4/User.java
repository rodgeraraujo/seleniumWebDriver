package com.test.seleniumWebDriver.example4;

public class User {
    private CharSequence username;
    private CharSequence password;

    public User(CharSequence username, CharSequence password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public static CharSequence getUsername() {
        return "201622010299";
    }

    public static CharSequence getPassword() {
        return "senha";
    }
}
