package com.mo;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter prime number-");
        int n=in.nextInt();
        for(c=2;c<n;c++)
        {
            if (n%c==0)
            {
                System.out.println(n+">>>>>> not prime");
                break;
            }
//            else
//            {
//                System.out.println("Number is prime");
//            }
        }
        if (c==n)
            System.out.println(n+">>>>>Number is prime");
    }
}
