package com.dsaLearningSeries.StriverSheet.Arrays;

public class SecondLargestElement {


    public static int  secondLargestElement(int[] nums) {
        int index = 1;
        int letMax = nums[0];



        int max = -1;

        int secondMax = -1;

        for (int i = 0; i < nums.length; i++) {

            if (letMax <= nums[i]) {

                max = nums[i];


            }


            // finding secomd max element batter approch :

            if (secondMax< nums[i] && nums[i] != max ) {

                secondMax = nums[i];



            }

        }



 return secondMax;
    }


    public  static void main(String[] args) {
        int arr[]={8, 8, 7, 6, 5};

        System.out.println(secondLargestElement(arr));
    }


}