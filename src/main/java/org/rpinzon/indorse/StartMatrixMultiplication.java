package org.rpinzon.indorse;

import org.apache.commons.lang3.Validate;
import org.rpinzon.indorse.matrix.MatrixMultiplication;
import org.rpinzon.indorse.util.Console;
import org.rpinzon.indorse.util.MatrixUtils;
import org.rpinzon.indorse.util.Printer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Renan T. Pinzon on 24/03/19.
 */
@SpringBootApplication
public class StartMatrixMultiplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(StartMatrixMultiplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StartMatrixMultiplication.class, args);
    }

    @Override
    public void run(String... args) {
        int firstMatrixRows = Console.nextPositiveInt("Enter the number of rows of the first matrix: ");
        int firstMatrixColumns = Console.nextPositiveInt("Enter the number of columns of the first matrix: ");
        int secondMatrixRows = Console.nextPositiveInt("Enter the number of rows of the second matrix: ");
        int secondMatrixColumns = Console.nextPositiveInt("Enter the number of columns of the second matrix: ");

        Validate.isTrue(firstMatrixColumns == secondMatrixRows, "The number of columns in the first matrix must match the number of rows in the second to be able to multiply them!");

        LOG.info("The matrix product will have the size of {}x{}", firstMatrixRows, secondMatrixColumns);

        int[][] firstMatrix = MatrixUtils.build(firstMatrixRows, firstMatrixColumns);
        int[][] secondMatrix = MatrixUtils.build(secondMatrixRows, secondMatrixColumns);

        LOG.info("First matrix: \n");
        Printer.display(firstMatrix);

        LOG.info("Second matrix: \n");
        Printer.display(secondMatrix);

        int[][] result = new MatrixMultiplication().run(firstMatrix, secondMatrix);

        LOG.info("Matrix product: \n");
        Printer.display(result);
    }

}
