package com.mo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator1 {
    public static void main(String[] args) {
//        make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
//        get the iterator
        Iterator<String> it = cars.iterator();
//        looping through the collection
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
