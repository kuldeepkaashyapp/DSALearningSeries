package com.dsaLearningSeries.practice.Leetcode;

public class palindromic_5 {

    public String longestPalindrome(String s) {
        char[] c= s.toCharArray();
        char[] R=resiprocate(c);
        int count=0;

        for (int i=0; i<R.length-1; i++) {
            if(c[i]==R[i]){
                count++;
            }
        }

        if(count >0){
            return R.toString();
        }else {
            return "";


        }
    }

   private  char[] resiprocate(char[] c){

char[] r=new char[c.length];

      for ( int i = c.length; i >=0; i--){
        r[i]=c[i];


      }
      return  r;
    }
}
