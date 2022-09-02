package com.apnacollege.problems.functions;

import java.util.Scanner;

public class hw_evenno_func {
    public static void printEven(int n){
        if (n%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is not even and is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printEven(n);
    }
}
