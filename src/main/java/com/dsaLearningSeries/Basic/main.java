package com.dsaLearningSeries.Basic;

public class main {


    static void main(String[] args) {

        Runnable  demo= ()->{
            System.out.println("this is from theread ");
        };


        demo.run();
    }
}
