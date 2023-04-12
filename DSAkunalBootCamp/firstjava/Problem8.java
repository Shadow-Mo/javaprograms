package com.KunalDSABootCamp.firstjava;

import java.util.Scanner;

//to find out whether given string is palindrome or not
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        if (isPalindrome(str)){
            System.out.println(str +" is a palindrome.");
        }else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
