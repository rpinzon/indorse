package org.rpinzon.indorse.util;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Renan T. Pinzon on 25/03/19.
 */
public class MatrixUtils {

    private static final Logger LOG = LoggerFactory.getLogger(MatrixUtils.class);

    private MatrixUtils() {
        // to prevent this class from being explicitly instantiated
    }

    /**
     * Build a matrix with the given number of rows and columns.
     *
     * @param rows the number of rows
     * @param cols the number of columns
     * @return a matrix with user input values
     */
    public static int[][] build(int rows, int cols) {
        Validate.isTrue(rows > 0, "The number of rows must be positive!");
        Validate.isTrue(cols > 0, "The number of columns must be positive!");
        LOG.info("Creating a matrix with {} rows and {} columns", rows, cols);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                LOG.info("Enter an integer value for position [{}][{}]:", row, col);
                matrix[row][col] = Console.nextInt();
            }
        }
        return matrix;
    }

}
