package game;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        String firstTeam = "First Team";
        String secondTeam = "Second Team";
        int numberPlayers = 25;
        int[] firstTeamAgeOfPlayers = setAgePlayers(numberPlayers);
        int[] secondTeamAgeOfPlayers = setAgePlayers(numberPlayers);
        Rugby rugby = new Rugby();
        rugby.printPlayersAge(firstTeamAgeOfPlayers, firstTeam);
        rugby.printPlayersAge(secondTeamAgeOfPlayers, secondTeam);
        System.out.println(firstTeam + " average age: " + rugby.averageAgePlayers(firstTeamAgeOfPlayers));
        System.out.println(secondTeam + " average age: " + rugby.averageAgePlayers(secondTeamAgeOfPlayers));
    }

    private static int[] setAgePlayers(int players) {
        int[] agePlayers = new int[players];
        int ageMin = 18;
        int ageMax = 40;
        for (int i = 0; i < agePlayers.length; i++) {
            agePlayers[i] = ThreadLocalRandom.current().nextInt(ageMin, ageMax);
        }
        return agePlayers;
    }

    private void printPlayersAge(int[] agePlayers, String nameTeam) {
        System.out.println(nameTeam + ":");
        int counter = 1;
        for (int age : agePlayers) {
            System.out.print("Player" + counter + " age: " + age + " ");
            counter++;
        }
        System.out.println();
    }

    private  int averageAgePlayers(int[] agePlayers) {
        int sum = 0;
        for (int i = 0; i < agePlayers.length; i++) {
            sum += agePlayers[i];
        }
        return sum / agePlayers.length;
    }
}
