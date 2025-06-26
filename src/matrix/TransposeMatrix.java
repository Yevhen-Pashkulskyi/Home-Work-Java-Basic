package matrix;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TransposeMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the row of Matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the column of Matrix: ");
        int column = sc.nextInt();

        int[][] matrix = createdMatrix(row, column);
        printMatrix(matrix, "Matrix");

        int[][] transposedMatrix = transposeMatrix(matrix, column, row);
        printMatrix(transposedMatrix, "Transposed matrix");
    }

    private static int[][] createdMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix, String nameMatrix) {
        System.out.println(nameMatrix + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix, int row, int column) {
        int[][] transposedMatrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

}
