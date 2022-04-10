package com.mo.exception;
//This will generate an error, because myNumbers[10] does not exist.
//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
public class exception1 {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
