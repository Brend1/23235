package com.example.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final Logger logger = LogManager.getLogger(UserRepository.class);

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        logger.info("Додано користувача: " + user.getFirstName() + " " + user.getLastName());
        users.add(user);
    }

    public void removeUser(User user) {
        logger.info("Видалено користувача: " + user.getFirstName() + " " + user.getLastName());
        users.remove(user);
    }

    public List<User> getUsers() {
        logger.info("Отримано список користувачів");
        return users;
    }
}