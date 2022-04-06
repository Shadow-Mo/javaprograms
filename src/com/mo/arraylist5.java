package com.mo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
//Sort an arraylist for integers
public class arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(90);
        numbers.add(50);
        numbers.add(20);
        numbers.add(5);
        Collections.sort(numbers);
        for (Integer i : numbers){
            System.out.println(i);
        }
    }
}
