package com.mo;

public class main2 {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Name : " +obj.fname);
        System.out.println("Age : " +obj.age);
        System.out.println("Graduation Year : " +obj.graduationyear);
        obj.study();
    }
}
