package game;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ContrStrike {
    public static void main(String[] args) {
        int numberOfPlayers = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the first team: ");
        String firstTeamName = sc.nextLine();
        String[] playersFirstTeam = enterNamePlayers(numberOfPlayers);
        int[] fragPlayersFirstTeam = getFragPlayers(firstTeamName, numberOfPlayers, playersFirstTeam);
        double avgFragFirstTeam = averageFrag(fragPlayersFirstTeam);

        System.out.print("Enter the name of the second team: ");
        String secondTeamName = sc.nextLine();
        String[] playersSecondTeam = enterNamePlayers(numberOfPlayers);
        int[] fragPlayersSecondTeam = getFragPlayers(secondTeamName, numberOfPlayers, playersSecondTeam);
        double avgFragSecondTeam = averageFrag(fragPlayersSecondTeam);

        printFragPlayers(firstTeamName, fragPlayersFirstTeam, playersFirstTeam);
        System.out.printf("\nAverage frags team %s: %.2f\n", firstTeamName, avgFragFirstTeam);
        printFragPlayers(secondTeamName, fragPlayersSecondTeam, playersSecondTeam);
        System.out.printf("\nAverage frags team %s: %.2f\n", secondTeamName, avgFragSecondTeam);

        double esp = 0.00001;// точность сравнения при действительных числах
        double difference = avgFragFirstTeam - avgFragSecondTeam; //разница между результатами
        if (abs(difference) > esp && difference > 0) {
            System.out.println("\nTeam " + firstTeamName + " has won!" + " Scored points: " + avgFragFirstTeam);
        } else if (abs(difference) > esp && difference < 0) {
            System.out.println("\nTeam " + secondTeamName + " has won!" + " Scored points: " + avgFragSecondTeam);
        } else if (abs(difference) <= esp) {
            System.out.println("\nDraw in the game! Both have points: " + avgFragFirstTeam);
        } else {
            System.out.println("\nThe game did not take place!");
        }
    }

    // функция расчитывает среднее арефметическое фрагов команды
    private static double averageFrag(int[] fragPlayers) {
        double sum = 0.0;
        for (int i = 0; i < fragPlayers.length; i++) {
            sum += fragPlayers[i];
        }
        return sum / fragPlayers.length;
    }

    // функция принимает в аргументы имя команды, и записывает в массив все фраги каждого игрока
    private static int[] getFragPlayers(String nameTeam, int numberOfPlayers, String[] playersName) {
        int[] fragPlayers = new int[numberOfPlayers];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < fragPlayers.length; i++) {
            System.out.printf("Enter the number of frags of \"%s\" of team %s: ", playersName[i], nameTeam);
            fragPlayers[i] = sc.nextInt();
        }
        return fragPlayers;
    }

    // функция просто пичатает количесвто фрагов каждого игрока
    private static void printFragPlayers(String nameTeam, int[] fragPlayers, String[] playersName) {
        for (int i = 0; i < fragPlayers.length; i++) {
            System.out.printf("\nPlayer %s of Team %s has a frag : %d", playersName[i], nameTeam, fragPlayers[i]);
        }
    }

    // функция записывает все имена игроков в масив
    private static String[] enterNamePlayers(int numberOfPlayers) {
        Scanner sc = new Scanner(System.in);
        String[] namePlayers = new String[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            namePlayers[i] = sc.nextLine();
        }
        return namePlayers;
    }
}
