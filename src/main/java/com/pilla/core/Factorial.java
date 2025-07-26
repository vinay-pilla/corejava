package com.pilla.core;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Hello World this is Factorial Program");
        int fact=1;
        for(int i=5;i>1;i--){
            fact*=i;
        }
        System.out.println("Factorial is : "+fact);
    }
}
