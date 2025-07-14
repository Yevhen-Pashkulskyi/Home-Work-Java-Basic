package org.example.oop.verificationLoginPassword;

import org.example.oop.exception.WrongLoginException;
import org.example.oop.exception.WrongPasswordException;

import java.util.Scanner;

public class AppLoginPassword {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean create = false;
        String login = null;
        String password = null;
        String confirmPassword = null;

        System.out.println("Welcome to Hillel D Java Basic");
        while (!create) {
            System.out.print("Пожалуйста введите свой логин: ");
            try {
                login = sc.nextLine();
                User.validateLogin(login);
                create = true;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }
        create = false;
        while (!create) {

            System.out.print("Пожалуйста введите свой пароль: ");
            try {
                password = sc.nextLine();
                User.validatePassword(password);
                create = true;
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        create = false;
        while (!create) {
            try {
                System.out.print("Введите подтверждения пароля: ");
                confirmPassword = sc.nextLine();
                User.equalsPassword(password, confirmPassword);
                System.out.println("User created successfully");
                create = true;
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        new User(login, password, confirmPassword);// не сохранял объект так как в задачи нет такого условия
    }
}
