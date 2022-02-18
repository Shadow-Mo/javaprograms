package com.mo;
//Recursion is the technique of making a function call itself.

public class Recursion {


    public static void main(String[] args){

        //    use recursion to add all of the numbers up to 10
        int result = sum(10);
        System.out.println(result);

        //Halting condition
        //use recursion to add all the numbers between  5 to 10.
        int num = sum(5,10);
        System.out.println(num);
    }

    public static int sum(int k){
        if (k>0){
            return k + sum(k-1);
        }else {
            return 0;
        }
    }                   //outputs 55

    public static int sum(int start,int end){
        if (end>start){
            return end + sum(start, end-1);
        }else{
            return end;
        }
    }                   //outputs 45
}
