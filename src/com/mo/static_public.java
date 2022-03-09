package com.mo;

public class static_public {
    static void staticmethod(){
        System.out.println("Static method can be called without creating objects");
    }
    public void publicmethod(){
        System.out.println("Public method must be called by creating objects");
    }

    public static void main(String[] args) {
        staticmethod();  //call the staticmethod
//        publicmethod();   this would compile an error
        static_public myobj = new static_public();
        myobj.publicmethod();     //call the public method on the object
    }
}
