package com.dsaLearningSeries.patterns;

public class Patterns {

    // rectangle Pattern


    //    *  *  *  *  *
    //    *  *  *  *  *
    //    *  *  *  *  *
    //    *  *  *  *  *


    void printReactangle(int row, int col){
        // outer  ring loop
        for(int j=1;j<=row;j++){
            // inner printing loop
            for(int k=1;k<=col;k++){
                System.out.print(" * ");
            }
            //printing new line
            System.out.println();
        }

    }





    //printing pattern perfect squere on single input
   // expeted output:

    //                 *  *  *  *  *
    //                 *  *  *  *  *
    //                 *  *  *  *  *
    //                 *  *  *  *  *
    //                 *  *  *  *  *

    void printSquare(int row){

        for(int i=1;i<=row;i++){
            for(int k=1; k<=row; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    void printDynamicIncrement(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                System.out.println(" "+k);
            }
        }
    }







}
