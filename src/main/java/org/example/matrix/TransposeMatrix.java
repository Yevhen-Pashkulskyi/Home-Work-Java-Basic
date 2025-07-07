package org.example.matrix;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TransposeMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    TransposeMatrix tM = new TransposeMatrix();
        System.out.print("Enter the row of Matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the column of Matrix: ");
        int column = sc.nextInt();

        int[][] matrix = tM.createdMatrix(row, column);
        tM.printMatrix(matrix, "Matrix");

        int[][] transposedMatrix = tM.transposeMatrix(matrix);
        tM.printMatrix(transposedMatrix, "Transposed matrix");

        int avgMatrix = tM.averageMatrix(matrix);
        System.out.println("Average matrix of matrix is: " + avgMatrix);

        System.out.println("Square matrix: " + tM.searchSquare(matrix));
    }

    // метод создает матрицу
    public int[][] createdMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(10);
            }
        }
        return matrix;
    }

    // метод распечатывает матрицу
    private void printMatrix(int[][] matrix, String nameMatrix) {
        System.out.println(nameMatrix + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод транспонирует матрицу
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    // метод считает среднюю арифметическою матрицы
    public int averageMatrix(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }

    // метод проверяет на квадратность матрицы
    public String searchSquare(int[][] matrix) {
        int count = 0;
        String square = "";
        if(matrix==null ||matrix.length == 0 || matrix[0].length == 0){
            return square;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length == matrix[i].length) {
                count++;
            }
        }
        if (count == matrix.length) {
            square = "Yes";
        } else {
           square = "No";
        }
        return square;
    }
}
