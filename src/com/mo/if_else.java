package com.mo;

public class if_else {
    public static void main(String[] args) {
//        If statement
        if (20>18){
            System.out.println("20 is greater than 18");
        }

        int x=20;
        int y=18;
        if (x>y){
            System.out.println("x is greater than y");
        }
//        Else statement
        int time = 20;
        if (time<18){
            System.out.println("Good Morning");
        }else {
            System.out.println("Good evening");
        }
//        Else if statement
        int time1 = 22;
        if (time1<10){
            System.out.println("Good Morning");
        }else if (time1<20){
            System.out.println("Good day");
        }else {
            System.out.println("Good Evening");
        }
//        short-hand if...else
        int time3 = 20;
        String result = (time3<18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
