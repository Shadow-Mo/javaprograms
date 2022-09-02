package com.apnacollege.problems.homework;

import java.util.Scanner;

//print all even numbers till n
public class print_even_no_till_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i =1;
        while (i<=n){
            if (i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
