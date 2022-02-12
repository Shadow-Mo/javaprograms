package com.mo;

public class Strings {
    public static void main(String[] args) {

//        how to find string length
        String txt = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println("Length of the txt string is " + txt.length());

//        uppercase to lowercase
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

//        finding the character in string
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

//        concatenation
        String firstname = "Mounesha";
        String lastname = "Zonde";
        System.out.println(firstname+ " "+lastname);
        System.out.println(firstname.concat(lastname));

//        special characters
        String txt3 = "It\"s alright";
        System.out.println(txt3);

//        adding numbers and strings
        int x =10;                  //adding number to numbers
        int y =20;
        int z =x+y;                  //z will be 30
        System.out.println(z);
        String x1 = "10";           //adding string to string
        String y1 = "20";
        String z1 = x1+y1;          //z will be 1020(String)
        System.out.println(z1);
        String x2="10";             // if you add number and string, result is string concatenation
        int y2=20;
        String z2 = x2+y2;          //z will be 1020(String)
        System.out.println(z2);
    }
}
