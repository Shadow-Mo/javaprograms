package com.mo;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username");

        String username = obj.nextLine();
        System.out.println("Username is " + username);
    }
}
