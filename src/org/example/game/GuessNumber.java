package org.example.game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gameOver = false;
        while (!gameOver) {
            System.out.print("Guess the number\n" +
                    "1) Game\n" +
                    "0) Quit\n" +
                    "Input your choice: ");
            int guess = sc.nextInt();
            switch (guess) {
                case 1:
                    guess();
                    break;
                case 0:
                    gameOver = true;
            }
        }
    }

    private static void guess() {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println("Guess the number between 0 and 10");
        int count = 0;
        int limitAttempt = 5;
        do {
            count++;
            System.out.print("Your guess: ");
            int namedNumber = sc.nextInt();
            if (namedNumber == randomNumber) {
                System.out.println("Congratulations! You won!");
                return;
            }
            if (count >= limitAttempt) {
                System.out.println("You lost!\n" +
                        "Number: " + randomNumber);
                return;
            }
        } while (true);
    }
}
