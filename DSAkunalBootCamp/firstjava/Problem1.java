package com.KunalDSABootCamp.Assignments.firstjava;
import java.util.*;
//write a program to whether input number is even or odd
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
