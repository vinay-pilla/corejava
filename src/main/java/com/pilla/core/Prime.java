package com.pilla.core;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=100;i++){
            if(i%2==0){
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
}
