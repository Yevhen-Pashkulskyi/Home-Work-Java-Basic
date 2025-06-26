package org.example.game;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int sizeTicket = 7;

        int[] playerTicket = fillTicketWithNumber(sizeTicket);
        System.out.println("Player Ticket:");
        printTicket(playerTicket);
        playerTicket = sortedNumberTicket(playerTicket);
        printTicket(playerTicket);

        int[] organizeTicket = fillTicketWithNumber(sizeTicket);
        System.out.println("Organize Ticket:");
        printTicket(organizeTicket);
        organizeTicket = sortedNumberTicket(organizeTicket);
        printTicket(organizeTicket);

        System.out.println("Количество совпадений: " + searchNumberToAirs(playerTicket, organizeTicket));
    }

    private static int[] fillTicketWithNumber(int sizeTicket) {
        int[] ticket = new int[sizeTicket];
        int highNumber = 9;
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(highNumber + 1);
        }
        return ticket;
    }

    // печатает масив в одну строку
    private static void printTicket(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println();
    }

    // сортирует масив от меньшего к большему
    private static int[] sortedNumberTicket(int[] ticket) {
        System.out.println("Sorted:");
        for (int i = 0; i < ticket.length - 1; i++) {
            for (int j = 0; j < ticket.length - 1 - i; j++) {
                if (ticket[j] > ticket[j + 1]) {
                    int temp = ticket[j];
                    ticket[j] = ticket[j + 1];
                    ticket[j + 1] = temp;
                }
            }
        }
        return ticket;
    }

    // поиск одинаковых значений в масиве
    private static int searchNumberToAirs(int[] firstArray, int[] secondArray) {
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                counter++;
            }
        }
        return counter;
    }
}
