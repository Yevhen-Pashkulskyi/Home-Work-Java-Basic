package org.example.oop.verificationLoginPassword;

import org.example.oop.exception.WrongLoginException;
import org.example.oop.exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String login;
    private String password;
    private static final int MAX_LENGTH_LOGIN = 20;
    private static final int MAX_LENGTH_PASSWORD = 25;
    private static final int MIN_LENGTH_PASSWORD = 6;

    public User(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password);
        equalsPassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    public void validateLogin(String login) {
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Логин не может быть пустым.");
        }
        if (!isValidMaxLength(login, MAX_LENGTH_LOGIN)) {
            throw new WrongLoginException("Логин не может быть больше " + MAX_LENGTH_LOGIN + " символов!");
        }
        if (!isValidationLatinLetters(login)) {
            throw new WrongLoginException("Логин должен быть только латиница");
        }
    }

    public void validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("Пароль не может быть пустым.");
        }
        if (!isValidOnlyStrAndNum(password)) {
            throw new WrongPasswordException("Пароль должен иметь только символы и цифры.");
        }
        if (!isValidOneChar(password)) {
            throw new WrongPasswordException("Пароль должен иметь минимум одну букву.");
        }
        if (!isValidOneNumber(password)) {
            throw new WrongPasswordException("Пароль должен иметь минимум одну цифру.");
        }
        if (password.length() < MIN_LENGTH_PASSWORD) {
            throw new WrongPasswordException("Пароль должен иметь минимум " + MIN_LENGTH_PASSWORD + " символов");
        }
        if (!isValidMaxLength(password, MAX_LENGTH_PASSWORD)) {
            throw new WrongPasswordException("Пароль не дожен быть больше " + MAX_LENGTH_PASSWORD + " символов!");
        }
    }

    public void equalsPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль с подтверждением не совпадают.");
        }
    }

    private boolean isValidationLatinLetters(String str) {
        for (Character ch : str.toCharArray()) {
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidMaxLength(String str, int maxLength) {
        if (str.length() > maxLength) {
            return false;
        }
        return true;
    }

    private boolean isValidOneChar(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    private boolean isValidOneNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    private boolean isValidOnlyStrAndNum(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
