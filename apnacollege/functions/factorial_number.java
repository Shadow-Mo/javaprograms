package com.apnacollege.problems.functions;

import java.util.Scanner;

public class factorial_number {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid number");
        }else{
            int factorial=1;
            for (int i=n; i>=1; i--){
                factorial= factorial * i;
            }
            System.out.println(factorial);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printFactorial(n);
    }
}
