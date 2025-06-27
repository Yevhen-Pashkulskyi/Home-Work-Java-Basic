package org.example.matrix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = 5; // todo вводить вручную
        int maxColumn = 10; // todo вводить вручную
        int[][] matrix = createMatrix(rows, maxColumn);
        printMatrix(matrix);
        System.out.println();
        printMatrix(sortedPairedRows(matrix));
    }

    // функция создает матрицу
    private static int[][] createMatrix(int rows, int max) {
        int maxNumbersForMatrix = rows * max;
        int[][] array = new int[rows][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[randomNumber(max)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber(maxNumbersForMatrix);
            }
        }
        return array;
    }

    // функция создает случайное число
    private static int randomNumber(int max) {
        return ThreadLocalRandom.current().nextInt(1, max);
    }

    // функция распечатывает матрицу
    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // функция сортирует парные ряды матрицы
    private static int[][] sortedPairedRows(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            if ((i+1)%2 == 0){
                sortedArray(matrix[i]);
            }
        }
        return matrix;
    }


    // функция сортирует массив
    private static int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    //========================
    // функция создает масив
    private static int[] createArray(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(max);
        }
        return array;
    }
}
