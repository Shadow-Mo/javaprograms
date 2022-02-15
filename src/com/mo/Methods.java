package com.mo;
//data passed into method is known as parameters..
// Methods are used to perform certain actions, they are also known as functions

public class Methods {

    static void mymethod(){
        System.out.println("I just got executed!");
    }

    public static void main(String[] args){
        mymethod();
    }
}

//mymethod() - name of the method
//static - means that mehtod belongs to main class and not an object of main class
//void - means this method does not have return value.