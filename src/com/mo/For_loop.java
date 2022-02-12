package com.mo;

public class For_loop {
    public static void main(String[] args) {
//        for loop
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
        for (int j=0;j<=10;j+=2){
            System.out.println(j);
        }
//        for-each loop
        String[] cars={"volvo", "BMW", "ford", "mazda"};
        for (String i: cars){
            System.out.println(i);
        }
    }
}
