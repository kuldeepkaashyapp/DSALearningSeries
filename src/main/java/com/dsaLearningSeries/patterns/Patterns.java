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

    //output expted

       /*    1 2 3 4 5
             1 2 3 4 5
             1 2 3 4 5
             1 2 3 4 5
             1 2 3 4 5
    */
    void printDynamicIncrement(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }


    // printng the ABCD pattern
    //concepet of ASCI value a  =64

    //output:
    //A B C D
    //A B C D
   // A B C D
    //A B C D


    public void alphbentPattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                System.out.print((char) (k+64)+" ");
            }

            System.out.println();
        }

    }

    // printing the value of the outer loop concept of ROw and colom
    //output
        /*  1111
            2222
            3333
            4444
*/
    public void printRepeatedNumberPattern(int n){

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //ASCAI concept:
  /*  output :
    A A A A A
    B B B B B
    C C C C C
    D D D D D
    E E E E E
*/
    public  void printRepeatedAlphabetPattern(int n ){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }
    }


  /*  print the pattern

    output:
    ------

            *
            **
            ***
            ****
            *****
        */


    public void printRightTrianglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){

                    System.out.print("*");

            }
            System.out.println();
        }
    }

  /*
    output
    ------

    A
    A B
    A B C
    A B C D

*/


    public   void printAlphabetTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print((char) (k+64)+" ");
            }
            System.out.println();
        }
    }


 /*   Write code to output :
    output
            * * * *
            * * *
            * *
            *
*/

    public void printStarFillipedPattern(int n ){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }





}
