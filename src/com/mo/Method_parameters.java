package com.mo;
//info passed to methods are parameter

public class Method_parameters {

    //parameters and arguments
    static void mymethod(String fname) {
        System.out.println(fname + " patil");
    }               //fname is parameter

    //Multi parameters
    static void mymethod(String sname, int age) {
        System.out.println(sname + " is " + age);
    }

//    Return values
    static int mymethod(int x){
        return 5+x;
    }
    //sum of method's two parameters-
    static int mymethod(int x1, int y1){
        return x1+y1;
    }
    //store the result in a variable-
    static double mymethod(double x2,double y2){
        return x2+y2;
    }
    //A method with if..else
    static void checkage(int age){
        if(age<18){
            System.out.println("Access denied- You are not old enough!");
        }else{
            System.out.println("Access granted- You are old enough!");
        }
    }

    public static void main(String[] args) {
        mymethod("mone");
        mymethod("sunny");
        mymethod("arya");
        mymethod("raj");
        //mone,sunny,arya,raj are arguments

        mymethod("jenny", 5);
        mymethod("anja", 8);
        mymethod("simo", 31);

        System.out.println(mymethod(3));

        System.out.println(mymethod(5,3));

        double z=mymethod(5.0,3.0);
        System.out.println(z);

        checkage(20);

    }
}

