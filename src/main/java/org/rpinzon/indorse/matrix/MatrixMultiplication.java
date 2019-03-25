package org.rpinzon.indorse.matrix;

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
        return new int[firstMatrix.length][secondMatrix[0].length];
    }

}
