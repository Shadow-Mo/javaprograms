package KunalDSABootCamp.firstjava;

import java.util.Scanner;

//input currency in rupees and output in dollars
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = n* 82.11;
        System.out.println(n + " rupees is "+ d + " dollars.");
    }
}
