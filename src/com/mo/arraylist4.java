package com.mo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
//Sort an arraylist for Strings
public class arraylist4 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Suzuki");
        Collections.sort(cars);  //sort cars
        for (String i : cars){
            System.out.println(i);
        }
    }
}
