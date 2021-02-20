package jrr.by.lesson2;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class ArrayService {

    ArrayService() {
    }

    static Logger logger = Logger.getLogger(ArrayService.class);

    static int[] create(int size) {
        return new int[size];
    }

    static void fillRandomly(int[] array) {
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 100));
            }
        } else throw new ArrayIndexOutOfBoundsException("array size is negative");
    }

    static void printArray(int[] array) {
        logger.info(Arrays.toString(array));
    }

    static int sum(int[] array) {
        int summing = 0;
        for (int j : array) {
            summing += j;
        }
        return summing;
    }

    static double avg(int[] array) {
        int summing = 0;
        for (int j : array) {
            summing += j;
        }
        return (double) summing / array.length;
    }

    static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    static int[] swap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
