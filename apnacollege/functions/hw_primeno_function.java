package com.apnacollege.problems.functions;

import java.util.Scanner;

public class hw_primeno_function {
    public static void printPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            if (n == 1) {
                System.out.println("Number is neither prime nor composite");
            } else {
                System.out.println("Number is prime");
            }
        } else {
            System.out.println("number is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPrime(n);
    }
}
