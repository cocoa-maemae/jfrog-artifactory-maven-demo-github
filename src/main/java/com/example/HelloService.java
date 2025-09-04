package com.example;

public class HelloService {
    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello";
        }
        return "Hello, " + name + "!";
    }
}



