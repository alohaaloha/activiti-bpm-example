package com.example.dto;

/**
 * Created by aloha on 22-Jan-17.
 */
public class UserLogin {

    String id;
    String password;

    public UserLogin(){}

    public UserLogin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
