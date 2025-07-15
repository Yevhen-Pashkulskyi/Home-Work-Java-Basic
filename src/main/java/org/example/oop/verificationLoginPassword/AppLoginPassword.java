package org.example.oop.verificationLoginPassword;

import org.example.oop.exception.WrongLoginException;
import org.example.oop.exception.WrongPasswordException;

import java.util.Scanner;

public class AppLoginPassword {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String login = null;
        String password = null;
        String confirmPassword = null;
        int counter = 0;
        final int maxAttempts = 3;

        while (counter < maxAttempts) {
            System.out.println("Welcome to Hillel D Java Basic");
            System.out.print("Пожалуйста введите свой логин: ");
            login = sc.nextLine();
            System.out.print("Пожалуйста введите свой пароль: ");
            password = sc.nextLine();
            System.out.print("Введите подтверждения пароля: ");
            confirmPassword = sc.nextLine();
            try {
                new User(login, password, confirmPassword);// не сохранял объект так как в задачи нет такого условия
                System.out.println("Пользователь успешно создан.");
                break;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                counter++;
            } finally {
                if (counter >= maxAttempts) {
                    System.out.println("Попытки исчерпаны, попробуйте позже.");
                    break;
                }
            }
        }
        System.out.println("Спасибо что пользовались нашим сервисом.");
    }
}
