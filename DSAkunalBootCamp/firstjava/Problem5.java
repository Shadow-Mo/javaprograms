package KunalDSABootCamp.firstjava;

import java.util.Scanner;

//take 2 input numbers and print the largest number
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("Largest number is "+a);
        }else {
            System.out.println("Largest number is "+b);
        }
    }
}
