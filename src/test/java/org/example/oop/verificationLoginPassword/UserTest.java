package org.example.oop.verificationLoginPassword;

import org.example.oop.exception.WrongLoginException;
import org.example.oop.exception.WrongPasswordException;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User testUser;
    private String login;
    private String password;
    private String confirmPassword;

    @BeforeEach
    void setUp() throws Exception {
        this.login = "admin";
        this.password = "admin123456";
        this.confirmPassword = "admin123456";
        this.testUser = new User(login, password, confirmPassword);
    }

    @Test
    void validateUserCreation() throws WrongLoginException, WrongPasswordException {
        Assertions.assertDoesNotThrow(() -> testUser);
    }

    @Test
    void validateLoginMaxLength() {
        String maxLength = "VeryBigNameLoginItsNotGoog";

        isValidLogin(maxLength);
    }

    @Test
    void validateLoginNull() {
        String login = null;

        isValidLogin(login);
    }

    @Test
    void validateLoginEmpty() {
        String login = "";

        isValidLogin(login);
    }

    @Test
    void validateLoginLatinChar() {
        String login = ";админ";

        isValidLogin(login);
    }

    @Test
    void validatePasswordNull() {
        String password = null;

        isValidPassword(password);
    }

    @Test
    void validatePasswordEmpty() {
        String password = "";

        isValidPassword(password);
    }

    @Test
    void validatePasswordLarger() {
        String password = "VeryBigNamePasswordItsNotGoog123";

        isValidPassword(password);
    }

    @Test
    void validatePasswordSmaller() {
        String password = "s1";

        isValidPassword(password);
    }

    @Test
    void validatePasswordMinOneChar() {
        String password = "123456";

        isValidPassword(password);
    }

    @Test
    void validatePasswordMinNumber() {
        String password = "password";

        isValidPassword(password);
    }

    @Test
    void equalsPassword() {
        String confirmPassword = "notEqualsPassword";

        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    new User(this.login, this.password, confirmPassword);
                });
    }

    private void isValidLogin(String login) {
        Assertions.assertThrows(WrongLoginException.class,
                () -> {
                    new User(login, this.password, this.confirmPassword);
                });
    }

    private void isValidPassword(String password) {
        Assertions.assertThrows(WrongPasswordException.class,
                () -> {
                    new User(this.login, password, this.confirmPassword);
                });
    }

}