package com.KunalDSABootCamp.firstjava;
//to calculate fibonacci number upto n numbers
public class Problem7 {
    public static void main(String[] args) {
        int a = 0;
        int b=1;
        System.out.println(a+" "+b);
        int count=10;
        for (int i=2; i<count; i++){
            int c= a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
