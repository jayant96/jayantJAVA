package com.jayant.string;

/**
 * Created by jayant on 8/13/2016.
 */
public class Pallindrome {

    public static void main(String[] args) {
        String input = "aaaaaaaa";
        char[] tempArray = input.toCharArray();
        int left, right;
        right = tempArray.length - 1;
        boolean flag = true;
        for (left = 0; left < right; left++, right--) {
            if (tempArray[left] != tempArray[right])  {
                flag = false;
                break;
            }
        }

        if (flag)   {
            System.out.println("pallindrome");
        } else {
            System.out.println("not a pallindrome");
        }

    }

}
