package com.mo.linkedlist;

import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Suzuki");
        cars.add("Ford");
        cars.addFirst("Mazda");  //adds an item to the beginning of the list
        cars.addLast("Mahindra");  //adds an item to the end of the list
        cars.removeFirst();  //removes the first item from the list
        cars.removeLast();  //removes the last item from the list
        System.out.println("First item - " + cars.getFirst());  //get the item at the beginning of the list
        System.out.println("Last item - " + cars.getLast());  //get the item at the end of the list
        for (String i : cars){
            System.out.println(i);
        }
    }
}
