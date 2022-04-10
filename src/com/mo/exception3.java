package com.mo.exception;
//Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted".
public class exception3 {
    static void checkage(int age){
        if (age<18){
            throw new ArithmeticException("Access denied- You must be at least 18 years old.");
        }else {
            System.out.println("Access granted- You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkage(15);
    }
}
