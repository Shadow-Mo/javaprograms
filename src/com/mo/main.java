package com.mo;
//abstract class
abstract class main {
    public String fname = "John";
    public int age = 24;
    public abstract void study();    //abstract method
}
class Student extends main{     //subclass (inherit from main)
    public int graduationyear = 2018;
    public void study(){        //body of the abstract method
        System.out.println("Studying all day long");
    }
}
