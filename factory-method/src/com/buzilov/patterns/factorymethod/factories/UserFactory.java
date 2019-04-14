package com.buzilov.patterns.factorymethod.factories;

import com.buzilov.patterns.factorymethod.model.Admin;
import com.buzilov.patterns.factorymethod.model.ContentManager;
import com.buzilov.patterns.factorymethod.model.SimpleUser;
import com.buzilov.patterns.factorymethod.model.User;

public class UserFactory {
    public User getUser(User.UserType userType, String username, String password) {
        switch(userType) {
            case SIMPLE_USER:
                return new SimpleUser(username, password);
            case ADMIN:
                return new Admin(username, password);
            case CONTENT_MANAGER:
                return new ContentManager(username, password);
            default:
                throw new IllegalArgumentException();
        }
    }
}
