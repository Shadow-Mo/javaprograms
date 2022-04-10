package com.mo.lambdaex;
//create a method which takes lambda expression as a parameter
interface Stringfunction{
    String run(String str);
}

public class lambdaex3 {
    public static void main(String[] args) {
        Stringfunction exclaim = (s) -> s + "!";
        Stringfunction ask = (s) -> s + "?";
        printformatted("Hello",exclaim);
        printformatted("Hello",ask);
    }
    public static void printformatted(String str,Stringfunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
