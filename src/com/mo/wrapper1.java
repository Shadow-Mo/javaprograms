package com.mo.wrapper;
//To create the wrapper object, use the wrapper class instead of primitive type.
public class wrapper1 {
    public static void main(String[] args) {
        Integer myint = 5;
        Double mydouble = 5.99;
        Character mychar = 'A';
        System.out.println(myint);
        System.out.println(mydouble);
        System.out.println(mychar);
//        following methods are used to get the value associated with the corresponding wrapper object
        System.out.println(myint.intValue());
        System.out.println(mydouble.doubleValue());
        System.out.println(mychar.charValue());
    }
}
