package org.rpinzon.indorse.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Renan T. Pinzon on 24/03/19.
 */
public class MatrixMultiplicationTest {

    @Test
    public void matrixMultiplicationTest() {
        int[][] expected = {
            {8, -3, 12},
            {0, -5, -8}
        };
        int[][] firstMatrix = {
            {4, -2, 3},
            {1, -3, 4}
        };
        int[][] secondMatrix = {
            {2, 0, 5},
            {6, 3, 7},
            {4, 1, 2}
        };
        int[][] result = new MatrixMultiplication().run(firstMatrix, secondMatrix);

        Assert.assertEquals("Number of rows", expected.length, result.length);
        Assert.assertEquals("Number of columns", expected[0].length, result[0].length);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidMatrixTest() {
        int[][] firstMatrix = new int[2][3];
        int[][] secondMatrix = new int[2][2];
        new MatrixMultiplication().run(firstMatrix, secondMatrix);
    }

    private void assertEquals(int[][] expected, int[][] matrix) {
        for (int row = 0; row < expected.length; row++) {
            for (int col = 0; col < expected[row].length; col++) {
                Assert.assertEquals("Value at [" + row + "][" + col + "]", expected[row][col], matrix[row][col]);
            }
        }
    }

}
