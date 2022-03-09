package com.mo;

public class math {
    public static void main(String[] args) {
//        find the highest value
        System.out.println(Math.max(5,10));

//        find the lowest value
        System.out.println(Math.min(5,10));

//        find the squareroot
        System.out.println(Math.sqrt(16));

//        returns absolute(positive) value
        System.out.println(Math.abs(-4.7));

//        returns a random number
        System.out.println(Math.random());

//        returns a random number between 0 & 100
        int randomnum = (int)(Math.random()*101);
        System.out.println(randomnum);
    }
}
