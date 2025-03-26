package com.practice.junitproject.password_validator_test;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.junitproject.password_validator.PasswordValidator;

class PasswordValidatorTest {

    /**
     * Tests valid passwords.
     */
    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("Password1"), "Should be valid");
        assertTrue(PasswordValidator.isValid("StrongPass123"), "Should be valid");
        assertTrue(PasswordValidator.isValid("SecureP4ss"), "Should be valid");
    }

    /**
     * Tests invalid passwords that are too short.
     */
    @Test
    void testShortPasswords() {
        assertFalse(PasswordValidator.isValid("Pass1"), "Too short");
        assertFalse(PasswordValidator.isValid("Abc123"), "Too short");
    }

    /**
     * Tests passwords missing uppercase letters.
     */
    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValid("password1"), "No uppercase letter");
        assertFalse(PasswordValidator.isValid("lowercase123"), "No uppercase letter");
    }

    /**
     * Tests passwords missing digits.
     */
    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"), "No digit");
        assertFalse(PasswordValidator.isValid("OnlyLetters"), "No digit");
    }

    /**
     * Tests null and empty passwords.
     */
    @Test
    void testNullOrEmptyPasswords() {
        assertFalse(PasswordValidator.isValid(null), "Null should be invalid");
        assertFalse(PasswordValidator.isValid(""), "Empty should be invalid");
    }
}
