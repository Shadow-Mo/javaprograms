package com.mo;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter name, age, salary: ");
        String name = myobj.nextLine();
        int age = myobj.nextInt();
        int salary = myobj.nextInt();
        System.out.println("Name is "+name +"\nAge is "+age +"\nSalary is "+salary);
    }
}
