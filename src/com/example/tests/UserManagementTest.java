package com.example.tests;

import com.example.users.User;
import com.example.users.UserRepository;
import com.example.utilities.PasswordUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserManagementTest {
    private static final Logger logger = LogManager.getLogger(UserManagementTest.class);

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("John", "Doe", "john.doe@example.com", "password123");
        userRepository.addUser(user1);

        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "pa$$w0rd");
        userRepository.addUser(user2);

        // Перевірка кількості користувач
        int numberOfUsers = userRepository.getUsers().size();
        logger.info("Кількість користувачів: " + numberOfUsers);

        // Перевірка наявності користувачів
        boolean containsUser1 = userRepository.getUsers().contains(user1);
        boolean containsUser2 = userRepository.getUsers().contains(user2);
        logger.info("Міститься користувач 1: " + containsUser1);
        logger.info("Міститься користувач 2: " + containsUser2);

        // Видалення користувача user1
        userRepository.removeUser(user1);

        // Перевірка кількості користувачів після видалення
        numberOfUsers = userRepository.getUsers().size();
        logger.info("Кількість користувачів після видалення: " + numberOfUsers);

        // Перевірка наявності користувачів після видалення
        containsUser1 = userRepository.getUsers().contains(user1);
        containsUser2 = userRepository.getUsers().contains(user2);
        logger.info("Міститься користувач 1 після видалення: " + containsUser1);
        logger.info("Міститься користувач 2 після видалення: " + containsUser2);

        // Перевірка міцності паролів
        String strongPassword = "MyStrongPassword";
        String weakPassword = "12345678";
        boolean isStrong1 = PasswordUtils.isStrongPassword(strongPassword);
        boolean isStrong2 = PasswordUtils.isStrongPassword(weakPassword);
        logger.info("Міцність паролю 1: " + isStrong1);
        logger.info("Міцність паролю 2: " + isStrong2);
    }
}