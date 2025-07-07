package org.example.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    private TransposeMatrix tM;
    private int[][] matrix;

    @BeforeEach
    void setUp() {
        this.tM = new TransposeMatrix();
//        this.matrix = new int[3][3];
    }

    @Test
    void searchSquareWhenYes() {
        String expected = "Yes";

        matrix = new int[3][3];

        assertEquals(expected, tM.searchSquare(matrix));
    }

    @Test
    void searchSquareWhenNo() {
        String expected = "No";

        matrix = new int[3][4];

        assertEquals(expected, tM.searchSquare(matrix));
    }

    @Test
    void searchSquareWhenNull() {
        String expected = "";

        matrix = null;

        assertEquals(expected, tM.searchSquare(matrix));
    }

    @Test
    void searchSquareWhenEmpty() {
        String expected = "";

        matrix = new int[][]{};

        assertEquals(expected, tM.searchSquare(matrix));
    }

    @Test
    void createdMatrix() {

        matrix = tM.createdMatrix(3, 3);

        assertNotNull(matrix);
    }

    @Test
    void transposeMatrix() {

        int[][] expected = new int[][]{
                {1, 4},
                {2, 5},
                {3, 6}
        };

        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] result = tM.transposeMatrix(matrix);

        assertArrayEquals(expected, result);
    }

    @Test
    void averageMatrix() {
        int expectedAvg = 3;
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        int res = tM.averageMatrix(matrix);

        assertEquals(expectedAvg, res);
    }
}