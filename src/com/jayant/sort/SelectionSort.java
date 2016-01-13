package com.jayant.sort;

/**
 * Created by jayant on 1/11/2016.
 */
public class SelectionSort {

    public static int[] selectionSort(int[] intArray)   {
        for (int i = 0; i < intArray.length; i++)    {
            int smallNumber = intArray[i];
            int minIndex = i;
            for (int j = i+1; j < intArray.length; j++) {
                if(intArray[j] < smallNumber)   {
                    smallNumber = intArray[j];
                    minIndex = j;
                }
            }
            intArray[minIndex] = intArray[i];
            intArray[i] = smallNumber;
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] intArrayValues = { 90, 2, 89, 1, 76, 63};
        ArrayDisplay.arrayValueDisplay(SelectionSort.selectionSort(intArrayValues));
    }


}
