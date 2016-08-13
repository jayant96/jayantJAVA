package com.jayant.string;

/**
 * Created by jayant on 8/13/2016.
 */
public class ReverseString {

    public static void main(String[] args) {
        String input = "reverse the string";
        char[] tempArray = input.toCharArray();
        int left, right;
        right = tempArray.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c : tempArray) {
            System.out.println(c + " ");
        }
    }

}
