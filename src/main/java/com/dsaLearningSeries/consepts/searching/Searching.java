package com.dsaLearningSeries.consepts.searching;

public class Searching {
    /*
    * Linear Search
    * Binary Search
    *
    * */

    void linearSearch(int[] arr, int key){

        for (int i = 0; i < arr.length; i++) {
           System.out.println((arr[i]==key) ? i :"Notfound");

        }

    }

    void binarySearch(int[] arr, int key){

        int low=0;
        int high=arr.length -1;

        while (low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.println(mid);

            } else if (arr[mid]<key) {
                low=mid+1;

            } else if (arr[mid]>key) {
                high=mid -1 ;
            }


        }
    }

}
