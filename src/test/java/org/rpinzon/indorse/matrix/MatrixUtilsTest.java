package org.rpinzon.indorse.matrix;

import org.junit.Test;
import org.rpinzon.indorse.util.MatrixUtils;

/**
 * Created by Renan T. Pinzon on 25/03/19.
 */
public class MatrixUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void negativeRowsTest() {
        MatrixUtils.build(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeColsTest() {
        MatrixUtils.build(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroRowsTest() {
        MatrixUtils.build(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroColsTest() {
        MatrixUtils.build(1, 0);
    }

}
