package com.dsaLearningSeries.Basic;

public class main {


    public static void main(String[] args) {

        Runnable  demo= ()->{
            System.out.println("this is from theread ");
        };


        demo.run();
    }
}
