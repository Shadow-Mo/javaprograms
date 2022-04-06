package com.mo.arraylist;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
//        object creation
        ArrayList<String> cars = new ArrayList<String>();
//        adding items
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
//        access an item
        System.out.println(cars.get(0));
//        change an item
        cars.set(0,"Opel");
        System.out.println(cars);
//        remove an item
        cars.remove(0);
        System.out.println(cars);
//        clear all items
        cars.clear();
        System.out.println(cars);
//        arraylist size
        System.out.println(cars.size());
    }
}
