package com.mo.hashmap;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
//        create a hashset object
        HashSet<Integer> numbers = new HashSet<Integer>();
//        Add values to the set
        numbers.add(8);
        numbers.add(4);
        numbers.add(7);
//        show which numbers between 1 and 10 are in set
        for (int i=1; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println(i+ " was found in the set.");
            }else {
                System.out.println(i+ " was not found in the set.");
            }
        }
    }
}
