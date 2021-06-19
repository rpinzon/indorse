package com.github.rpinzon.matrix;

import org.apache.commons.lang3.Validate;

/**
 * Created by Renan T. Pinzon on 24/03/19.
 */
public class MatrixMultiplication {

    /**
     * Run the multiplication of the matrices. It will produce a new matrix of
     * X rows and Y columns where X is equal to the number of rows in the first
     * matrix and Y is equal to the number of columns in the second matrix.
     * <p/>
     * See https://en.wikipedia.org/wiki/Matrix_multiplication for more details
     *
     * @param firstMatrix the first matrix
     * @param secondMatrix the second matrix
     * @return a matrix product
     */
    public int[][] run(int[][] firstMatrix, int[][] secondMatrix) {
        Validate.isTrue(firstMatrix[0].length == secondMatrix.length, "The number of columns in the first matrix must match the number of rows in the second to be able to multiply them!");
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < secondMatrix[0].length; col++) {
                for (int i = 0; i < firstMatrix[0].length; i++) {
                    result[row][col] += firstMatrix[row][i] * secondMatrix[i][col];
                }
            }
        }
        return result;
    }

}
