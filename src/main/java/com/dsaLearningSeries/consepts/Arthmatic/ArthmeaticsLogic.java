package com.dsaLearningSeries.consepts.Arthmatic;

public class ArthmeaticsLogic {

    public void fabonachiSeries(){
        int count=0;
        int n=5;


        for(int i=0;i<n ; i++){
            System.out.println(count);
            count+=i;

        }
    }


//
//    public void hfcM(int a,int b){
//
//        int max=Math.max(a,b);
//        int min=Math.min(a,b);
//
//        int arr[]=new int[100];
//        for(int i=0;i<max;i++){
//            double temp =min%max;
//
//            min=temp;
//
//            arr[i]=temp;
//
//        }
//
//        for(int s:arr){
//            System.out.println(s);
//        }
//
//    }

    void reverse(Integer a){


        while (a!=0){
            int temp=a%10;
            System.out.println();
            a=a/10;

        }




    }



    void subarryCheck(int... a){

        int max=0;
        for (int i=0;i<a.length;i++){

            for (int j=i+1;j<a.length;j++){

                int temp =a[i]+a[j];

                if (temp>max){
                    max=temp;
                }

            }
        }

        System.out.println(max);

    }


}
