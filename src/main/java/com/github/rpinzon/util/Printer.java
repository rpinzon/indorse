package com.github.rpinzon.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Renan T. Pinzon on 24/03/19.
 */
public class Printer {

    private static final Logger LOG = LoggerFactory.getLogger(Printer.class);

    private Printer() {
        // to prevent this class from being explicitly instantiated
    }

    /**
     * Print all elements of the given matrix separating elements in the same
     * row by space.
     * <p/>
     * Example:
     * <pre>
     *   2 9 1
     *   3 -1 4
     *   4 0 8
     * </pre>
     *
     * @param matrix the matrix to print values
     */
    public static void display(int[][] matrix) {
        StringBuilder output = new StringBuilder();
        for (int[] row : matrix) {
            for (int col : row) {
                // append each element of a row separated by space
                output.append(col).append(" ");
            }
            // break line
            output.append('\n');
        }
        LOG.info(output.toString());
    }

}
