package com.apnacollege.problems.functions;

import java.util.Scanner;

public class hw_table_fuc {
    public static void printTable(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printTable(n);
    }
}
