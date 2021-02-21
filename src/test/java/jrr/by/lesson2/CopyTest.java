package jrr.by.lesson2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyTest {

    @Test
    void copyInRange1() {
        Copy array = new Copy();
        int[] expected = {2, 4};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 2, 5);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void copyInRange2() {
        Copy array = new Copy();
        int[] expected = {};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 9, 10);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void copyInRange3() {
        Copy array = new Copy();
        int[] expected = {};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 5, 2);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}