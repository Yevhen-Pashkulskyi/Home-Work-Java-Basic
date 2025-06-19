package parallelepiped;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter first side or zero to exit:");
            double length = sc.nextDouble();
            if (length == 0){
                break;
            }
            System.out.print("Enter second side:");
            double weight = sc.nextDouble();
            System.out.print("Enter third side:");
            double height = sc.nextDouble();
            double volume = weight * height * height;
            double totalLength = 4 * (length + height + weight);
            System.out.println("Объем параллелепипеда = " + volume + "\n"
                    + "Длина параллелепипеда = " + totalLength);
        }
    }
}
