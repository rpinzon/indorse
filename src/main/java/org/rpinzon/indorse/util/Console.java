package org.rpinzon.indorse.util;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by Renan T. Pinzon on 24/03/19.
 */
public class Console {

    private static final Logger LOG = LoggerFactory.getLogger(Console.class);

    private static final Scanner scanner = new Scanner(System.in);

    private Console() {
        // to prevent this class from being explicitly instantiated
    }

    /**
     * Read an integer value from user input console and validate whether it is
     * positive.
     *
     * @param message the message to show to user
     * @return a positive integer
     */
    public static int nextPositiveInt(String message) {
        LOG.info(message);
        int value = Console.nextInt();
        Validate.isTrue(value > 0, "Expecting a positive integer but got %s!", value);
        return value;
    }

    /**
     * Read an integer value from user input console. If the user type an invalid
     * value it will ask again over and over.
     *
     * @return typed value
     */
    static int nextInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            LOG.error("Invalid value! Please enter an integer value!");
        }
    }

}
