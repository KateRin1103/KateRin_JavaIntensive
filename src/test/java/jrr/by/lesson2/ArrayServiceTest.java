package jrr.by.lesson2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static jrr.by.lesson2.ArrayService.*;

public class ArrayServiceTest {

    @Test
    public void testCreate() {
        int[] array = ArrayService.create(7);
        logger.info("Array: " + Arrays.toString(array));
    }

    @Test
    public void testFillRandomly() {
        int[] array = new int[10];
        fillRandomly(array);
        logger.info("Array: " + Arrays.toString(array));
    }

    @Test
    public void testPrintArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        printArray(array);
    }

    @Test
    public void testSum() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        Assert.assertEquals(25, sum(array));
        logger.info("Sum = " + sum(array));
    }

    @Test
    public void testAvg() {
        int[] array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 3};
        Assert.assertEquals(3.0, avg(array));
        logger.info("Avg = " + avg(array));
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