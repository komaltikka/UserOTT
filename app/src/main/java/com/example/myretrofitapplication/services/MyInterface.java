package com.example.myretrofitapplication.services;

public interface MyInterface {
    void register();

    void login(String name, String email, String created_at);

    void logout();
}
