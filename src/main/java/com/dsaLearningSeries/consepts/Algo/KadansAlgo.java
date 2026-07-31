package com.dsaLearningSeries.consepts.Algo;

public class KadansAlgo {

    public static void maxSum(int arr[]){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        sum+=arr[i];
        maxSum=Math.max(sum,maxSum);
    if(sum<0){
        sum=0;
    }
    }
    System.out.println(maxSum);
    }


}
