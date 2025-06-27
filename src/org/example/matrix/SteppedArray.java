package org.example.matrix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the maximum number of columns");
        int maxColumn = sc.nextInt();

        System.out.println("\nThe created matrix:");
        int[][] matrix = createMatrix(rows, maxColumn);
        printMatrix(matrix);

        System.out.println("\nSorted paired rows matrix:");
        int[][] sortMatrix = sortedPairedRows(matrix);
        printMatrix(sortMatrix);

        System.out.println("\nSum of all elements: " + totalSumMatrixElement(matrix));

        int[] minNumArr = minNumberMatrix(matrix);
        System.out.println("\nArray with minimum numbers of matrix: " + Arrays.toString(minNumArr));

        int absMin = searchMinNumber(minNumArr);
        System.out.println("\nAbsolute minimum in the matrix: " + absMin);

        System.out.println("\nAll elements of the sorted matrix are divided into the absolute minimum:");
        int[][] divMinMatrix = divideElementMatrix(sortMatrix, absMin);
        printMatrix(divMinMatrix);
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

    // метод распечатывает матрицу
    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // функция сортирует парные ряды матрицы
    private static int[][] sortedPairedRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 == 0) {
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

    // функция считает сумму всех элементов
    private static int totalSumMatrixElement(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // функция ищет минимальное значение в масиве
    private static int searchMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return Math.abs(min);
    }

    // функция ище т в каждой строке минимальное значение в матрице и выдает масив с минимальными значениями
    private static int[] minNumberMatrix(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = searchMinNumber(matrix[i]);
        }
        return arr;
    }

    // функция делит на абсолютный минимум все лементы матрицы
    private static int[][] divideElementMatrix(int[][] matrix, int abs) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] / abs;
            }
        }
        return matrix;
    }
}
