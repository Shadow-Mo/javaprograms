package com.mo.hashmap;

import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
//        create an hashmap object
        HashMap<String, String> capitals = new HashMap<String, String>();
//        Add keys and values (Country,City)
        capitals.put("England", "London");
        capitals.put("German", "Berlin");
        capitals.put("Norway", "Oslo");
        capitals.put("USA", "Washington DC");
        System.out.println(capitals);
//        Access the item
        System.out.println(capitals.get("England"));
//        remove an item
        capitals.remove("England");
        System.out.println(capitals);
//      to find out number of items
        System.out.println(capitals.size());
//        print keys
        for (String i : capitals.keySet()){
            System.out.println(i);
        }
//        print values
        for (String j : capitals.values()){
            System.out.println(j);
        }
//        print keys and values
        for (String k : capitals.keySet()){
            System.out.println("keys: " +k+ " \nvalue : " +capitals.get(k));
        }
    }
}
