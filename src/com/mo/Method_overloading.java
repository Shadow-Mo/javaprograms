package com.mo;
//with method overloading, multiple methods can have the same name with different parameters

public class Method_overloading {
    //two methods that add numbers of different type
    static int plusmethodint(int x, int y){
        return x+y;
    }
    static double plusmethoddouble(double x, double y){
        return x+y;
    }
    //overload the plusmethod method to work for both int and double-
    static int plusmethod(int x, int y){
        return x+y;
    }
    static double plusmethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args){
        int num1 = plusmethodint(3,5);
        System.out.println("int: " + num1);
        double num2 = plusmethoddouble(4.3,5.6);
        System.out.println("double: " + num2);

        int num3 = plusmethod(7,8);
        double num4 = plusmethod(9.0,7.3);
        System.out.println("int: " + num3);
        System.out.println("double: " + num4);
    }
}
