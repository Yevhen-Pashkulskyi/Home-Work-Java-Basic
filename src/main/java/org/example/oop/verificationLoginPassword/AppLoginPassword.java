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

        while (!create) {
            System.out.println("Welcome to Hillel D Java Basic");
            System.out.print("Пожалуйста введите свой логин: ");
            login = sc.nextLine();
            System.out.print("Пожалуйста введите свой пароль: ");
            password = sc.nextLine();
            System.out.print("Введите подтверждения пароля: ");
            confirmPassword = sc.nextLine();
            try {
                new User(login, password, confirmPassword);// не сохранял объект так как в задачи нет такого условия
                create = true;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
