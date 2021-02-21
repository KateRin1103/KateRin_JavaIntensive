package jrr.by.lesson2;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import static jrr.by.lesson2.ArrayService.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArrayServiceTest {

    Logger logger = Logger.getLogger(ArrayService.class);

    @Test
    public void testCreate() {
        int[] array = ArrayService.create(7);
        assertEquals(7, array.length);
        logger.info("Array: " + Arrays.toString(array));
    }

    @Test
    public void testFillRandomly() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        fillRandomly(array2);
        fillRandomly(array1);
        assertNotEquals(Arrays.toString(array1), Arrays.toString(array2));
    }

    @Test
    public void testPrintArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        printArray(array);
    }

    @Test
    public void testSum() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertEquals(25, sum(array));
        logger.info("Sum = " + sum(array));
    }

    @Test
    public void testAvg() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 3};
        assertEquals(3.0, avg(array));
        logger.info("Avg = " + avg(array));
    }

    @Test(expected = ArithmeticException.class)
    public void testAvgZero() {
        int[] array = new int[0];
        assertEquals(3.0, avg(array));
    }

    @Test
    public void testSort() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4};
        int[] expected = new int[]{1, 2, 3, 4, 4, 5};
        Assert.assertArrayEquals(expected, sort(array));
        logger.info("Sorted array " + Arrays.toString(array));
    }

    @Test
    public void testSwap() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4};
        int[] expected = new int[]{5, 4, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, swap(array));
        logger.info("Sorted array " + Arrays.toString(array));
    }
}