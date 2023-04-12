package KunalDSABootCamp.firstjava;

import java.util.Scanner;

//write a program to take input principal , time, rate(P ,T ,R) and find simple interest
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();   //Rs.5000
        int Rate = sc.nextInt();        //rate 10 pa
        int Time = sc.nextInt();        //2 years
        int SI = (Principal * Rate * Time)/100;
        System.out.println("Principal is "+Principal);
        System.out.println("Rate is "+Rate);
        System.out.println("Time is "+Time);
        System.out.println("Simple Interest is : "+SI);
    }
}
