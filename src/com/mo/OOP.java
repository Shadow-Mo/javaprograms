package com.mo;
/*
OOP- Object Oriented Programming
OOP is about creating objects that contain both data and methods
-Classes and Objects aer two main aspects of OOP
-Class is like an object constructor, or a "blueprint" for creating objects
 */
//    CLASSES / OBJECTS

public class OOP {

    int x=5;

    public static void main(String[] args){
// Create an object called "myobj" and print value of x-
        OOP myobj = new OOP();
        System.out.println(myobj.x);

//    create two objects of OOP-
        OOP myobj1 = new OOP();    //object 1
        OOP myobj2 = new OOP();    //object 2
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

    }
}
