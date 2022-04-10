package com.mo.wrapper;
//toString() method-which is used to create wrapper objects to strings.
//In the following ex-we convert an Integer to String, and use the length() method of the String class to output the length of the 'String'
public class wrapper2 {
    public static void main(String[] args) {
        Integer myint = 100;
        String mystring = myint.toString();
        System.out.println(mystring.length());
    }
}
