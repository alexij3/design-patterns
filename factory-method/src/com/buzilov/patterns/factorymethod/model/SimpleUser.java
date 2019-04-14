package com.buzilov.patterns.factorymethod.model;

public class SimpleUser extends User {

    public SimpleUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void saySomething() {
        System.out.println("I am a simple user. I can take courses.");
    }
}
