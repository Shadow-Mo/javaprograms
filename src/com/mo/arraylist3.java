package com.mo.arraylist;

import java.util.ArrayList;
//create an arraylist to store numbers
public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> mynumbers = new ArrayList<Integer>();
        mynumbers.add(10);
        mynumbers.add(20);
        mynumbers.add(30);
        mynumbers.add(40);
        mynumbers.add(50);
        for (int i : mynumbers){
            System.out.println(i);
        }
    }
}
