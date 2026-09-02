package com.dsaLearningSeries.StriverSheet.Arrays;

import java.util.ArrayList;
import java.util.List;

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



    public static boolean isSorted(ArrayList<Integer> nums)  throws Exception{
        boolean status=false;
        for(int i =0; i <nums.size(); i++){

            if(nums.get(i) >= nums.get(i + 1) && nums.get(i) <= nums.get(i + 1)){

                status=true;

            }else{

                return false;
            }



        }

        return status;
        //your code goes here
    }


    public  static void main(String[] args) {
        int [] arr= {
1,2,3,4,5,6,7,8,9
        };




       // System.out.println(isSorted(ar));
    }


}