package com.example.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordUtils {
    private static final Logger logger = LogManager.getLogger(PasswordUtils.class);

    public static boolean isStrongPassword(String password) {
        logger.info("Перевірка міцності паролю: " + password);
        return password.length() >= 8;
    }
}