package com.apnacollege.problems.homework;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter 1 for Addition : ");
        System.out.println("Enter 2 for Subtraction : ");
        System.out.println("Enter 3 for division : ");
        System.out.println("Enter 4 for Multiplication: ");
        int a=x+y;
        int b=x-y;
        int c=x/y;
        int d=x*y;
        int number=sc.nextInt();
        switch (number){
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
            case 4:
                System.out.println(d);
            default:
                System.out.println("");
        }
    }
}
