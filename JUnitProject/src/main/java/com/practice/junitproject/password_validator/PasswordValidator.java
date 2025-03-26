package com.practice.junitproject.password_validator;

public class PasswordValidator {

    /**
     * Validates if the given password meets the required security criteria:
     * - At least 8 characters long
     * - Contains at least one uppercase letter
     * - Contains at least one digit
     *
     * @param password The password to validate.
     * @return true if the password is valid, false otherwise.
     */
    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false; // Must be at least 8 characters
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasDigit;
    }
}


