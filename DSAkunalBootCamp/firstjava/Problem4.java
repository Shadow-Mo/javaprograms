package KunalDSABootCamp.firstjava;

import java.util.Scanner;

//take input of two numbers and operators (+, -, *, /)and calculate the value
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division.");
        int number = sc.nextInt();
        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        if (number==1){
            System.out.println("Addition of two numbers is "+ addition);
        }else if (number==2){
            System.out.println("Subtraction of two number is "+ subtraction);
        }else if (number==3){
            System.out.println("Multiplication of two number is "+ multiplication);
        }else if (number==4){
            System.out.println("Division of two numbers is "+ division);
        }else{
            System.out.println("Invalid number");
        }
    }
}
