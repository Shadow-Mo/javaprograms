package com.KunalDSABootCamp.firstjava;

import java.util.Scanner;

//Take a name as an input and print a greeting message to that name
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+", Its good to see you again.");
    }
}
