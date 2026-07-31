package com.dsaLearningSeries.practice.Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse_Integer {


//
//    7. Reverse Integer
//    Medium
//            Topics
//    premium lock icon
//            Companies
//    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//    Example 1:
//
//    Input: x = 123
//    Output: 321
//    Example 2:
//
//    Input: x = -123
//    Output: -321
//    Example 3:
//
//    Input: x = 120
//    Output: 21
//
//
//    Constraints:
//
//            -231 <= x <= 231 - 1


    public int reverse(int x) {
        int reversed = 0;

        while(x!=0){
            int remainder=x%10;



            x=x/10;


            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;
            }


            // Negative overflow
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;
            }

            reversed=reversed*10+remainder;
        }
         return reversed;
    }//1534236469




   public void checkSecondLargest(int [] arr){
      Arrays.sort(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {

                System.out.println(arr[i-1]);
                break;
            }
        }




    }






}
