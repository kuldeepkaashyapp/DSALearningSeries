package com.dsaLearningSeries.DSA;

import java.util.ArrayList;

public class mainapp {


    public static void main(String[] args) {
      ArrayDemo demo = new ArrayDemo();
      int arr[]={2,5,1,3,4,7};
     int [] newArr= demo.shuffle(arr,3);


   for(int a:newArr){

       System.out.println(a);
   }

    }



}
