package com.jayant.search;

/**
 * Created by jayant on 1/11/2016.
 */
public class BinarySearch {

    public static int binarySearch(int[] intArray, int element)  {
        int max = intArray.length - 1;
        int min = 0;
        int middle = max + min / 2;

        while ( middle >= 0 && max >= min) {
            if (intArray[middle] > element) {
                max = middle - 1;
            } else if (intArray[middle] < element) {
                min = middle + 1;
            } else {
                return middle;
            }
            middle = max + min / 2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] intArray = { 1, 4, 67, 78, 90, 1000};
        int element = 1;
        System.out.println("BinarySearch.binarySearch(intArray, element) = " + BinarySearch.binarySearch(intArray, element));

    }

}
