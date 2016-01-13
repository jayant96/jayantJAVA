package com.jayant.sort;

/**
 * Created by jayant on 1/11/2016.
 */
public class InsertionSort {

    public static int[] insertionSort(int[] intArray)   {

        for (int i = 0; i < intArray.length; i++)   {

            int current = intArray[i];
            int j = i - 1;
            while (j >= 0 && intArray[j] > current) {
                intArray[j + 1] = intArray[j];
                --j;
            }
            intArray[j + 1] = current;
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] intArrayValues = { 90, 2, 89, 1, 76, 63};
        ArrayDisplay.arrayValueDisplay(InsertionSort.insertionSort(intArrayValues));
    }

}
