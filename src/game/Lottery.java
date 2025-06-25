package game;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int sizeTicket = 7;
        int[] playerTicket = fillTicketWithNumber(sizeTicket);
        printTicket(playerTicket);
        int[] organizeTicket = fillTicketWithNumber(sizeTicket);
        printTicket(organizeTicket);
    }

    private static int[] fillTicketWithNumber(int sizeTicket) {
        int[] ticket = new int[sizeTicket];
        int low = 0;
        int high = 9;
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(low, high + 1);
        }
        return ticket;
    }

    private static void printTicket(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
    }

    private static int[] sortedNumberTicket(int[] ticket) {
        int[] result = new int[ticket.length];
        int min = ticket[0];
        for (int i = 1; i < ticket.length; i++) {
            if (ticket[i] < min) {
                min = ticket[i];
                result[i] = min;
            }
            result[i] = ticket[i];
        }
        return result;
    }
}
