package com.mo;
//if you don't want the ability to override existing values, declare the attribute as 'final'

public class cant_override {
    final int x= 10;

    public static void main(String[] args) {
        cant_override myobj = new cant_override();
        myobj.x =45;
        System.out.println(myobj.x);
    }
}
//will generate an error: cannot assign a value to a final variable