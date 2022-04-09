package com.mo.hashmap;

import java.util.HashMap;
//Create a hashmap object to store String keys and Integer values
public class hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<String,Integer>();
//        Add keys and values (Names,Age)
        people.put("John",24);
        people.put("Steve",30);
        people.put("Angie",33);
//        print keys and values
        for (String i : people.keySet()){
            System.out.println("Keys: " +i+ "\nvalue: " +people.get(i));
        }
    }
}
