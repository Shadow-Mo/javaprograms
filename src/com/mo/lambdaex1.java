package com.mo.lambdaex;

import java.util.ArrayList;

//use the lambda expression in the Arraylists forEach() method to prevent every item in the list
public class lambdaex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.forEach((n)->{
            System.out.println(n);
        });
    }
}
