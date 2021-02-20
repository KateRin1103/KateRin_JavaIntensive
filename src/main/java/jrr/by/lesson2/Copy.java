package jrr.by.lesson2;

public class Copy {

    public int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        if (numberFrom <= numberTo) {
            int newSize = 0;
            for (int element : array) {
                if (element >= numberFrom && element <= numberTo) {
                    newSize++;
                }
            }
            int[] newArray = new int[newSize];
            int k = 0;
            for (int j : array) {
                if (j >= numberFrom && j <= numberTo) {
                    newArray[k] = j;
                    k++;
                }
            }
            return newArray;
        } else return new int[0];
    }

}
