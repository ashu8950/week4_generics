package com.practice.junitproject.user_registration_test;

import org.junit.jupiter.api.Test;
import com.practice.junitproject.user_registration.UserRegistration;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    /**
     * ✅ Tests successful user registration.
     */
    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!", 
                     UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    /**
     * ❌ Tests empty username (should throw IllegalArgumentException).
     */
    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("", "john.doe@example.com", "Password1")
        );
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    /**
     * ❌ Tests invalid email format (should throw IllegalArgumentException).
     */
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1")
        );
        assertEquals("Invalid email format.", exception.getMessage());
    }

    /**
     * ❌ Tests weak password (missing digit).
     */
    @Test
    void testWeakPasswordMissingDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", 
                     exception.getMessage());
    }

    /**
     * ❌ Tests weak password (too short).
     */
    @Test
    void testWeakPasswordTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Pass1")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", 
                     exception.getMessage());
    }

    /**
     * ❌ Tests weak password (missing uppercase letter).
     */
    @Test
    void testWeakPasswordMissingUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "password1")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", 
                     exception.getMessage());
    }

    /**
     * ❌ Tests null username, expecting IllegalArgumentException.
     */
    @Test
    void testNullUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser(null, "john.doe@example.com", "Password1")
        );
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    /**
     * ❌ Tests null password, expecting IllegalArgumentException.
     */
    @Test
    void testNullPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", null)
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", 
                     exception.getMessage());
    }
}
