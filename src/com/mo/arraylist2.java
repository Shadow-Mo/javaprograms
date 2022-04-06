package com.mo.arraylist;

import java.util.ArrayList;

//loop thorough an arraylist
public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("suzuki");
        cars.add("Ford");
        System.out.println(cars);
        for (int i = 0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
        for (String i : cars){
            System.out.println(i);
        }
    }
}
