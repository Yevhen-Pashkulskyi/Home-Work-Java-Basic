package spacecraft;

public class SpacecraftNumbering {
    public static void main(String[] args) {
        printNumberSpacecraft(numbersSpacecraft());
    }

    private static int[] numbersSpacecraft() {
        int limitSpaceCraft = 100;
        int[] numbersSpacecraft = new int[limitSpaceCraft];
        int fourUnluckyNumber = 4;
        int nineUnluckyNumber = 9;
        int count = 0;
        int numShattle = 0;
        while (true) {
            if (String.valueOf(numShattle).contains(String.valueOf(fourUnluckyNumber)) ||
                    String.valueOf(numShattle).contains(String.valueOf(nineUnluckyNumber))) {
                numShattle++;
                continue;
            }
            numbersSpacecraft[count] = numShattle;
            count++;
            numShattle++;
            if (count == limitSpaceCraft) {
                break;
            }
        }
        return numbersSpacecraft;
    }

    private static void printNumberSpacecraft(int[] numbersSpacecraft) {
        int count = 1;
        for (int number : numbersSpacecraft) {
            System.out.println("Spacecraft " + count + " - " + number);
            count++;
        }
    }
}
