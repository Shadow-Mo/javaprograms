package com.apnacollege.problems.homework;

import java.util.Scanner;

//print if number n is prime or not
public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i=2; i<=n/2; i++){
            if (n % i == 0){
                isPrime= false;
                break;
            }
        }

        if (isPrime){
            if (n==1){
                System.out.println(n+" is neither prime not composite.");
            }else {
                System.out.println(n+" is a prime number");
            }
        }else {
            System.out.println(n+" is not a prime number.");
        }
    }
}
