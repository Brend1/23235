package com.example.users;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
    private static final Logger logger = LogManager.getLogger(User.class);

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    // Геттери та сеттери для властивостей користувача

    public String getFirstName() {
        logger.info("Отримано ім'я користувача: " + firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        logger.info("Встановлено ім'я користувача: " + firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        logger.info("Отримано прізвище користувача: " + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        logger.info("Встановлено прізвище користувача: " + lastName);
        this.lastName = lastName;
    }

    public String getEmail() {
        logger.info("Отримано електронну пошту користувача: " + email);
        return email;
    }

    public void setEmail(String email) {
        logger.info("Встановлено електронну пошту користувача: " + email);
        this.email = email;
    }

    public String getPassword() {
        logger.info("Отримано пароль користувача");
        return password;
    }

    public void setPassword(String password) {
        logger.info("Встановлено пароль користувача");
        this.password = password;
    }
}