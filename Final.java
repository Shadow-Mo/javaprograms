package com.mo;
//If you don't want the ability to override existing attribute values, declare attributes as final:

public class Final {
    final int x=10;
    final double pi = 3.14;

    public static void main(String[] args) {
        Final obj = new Final();
        int x=25;         will generate an error :cannot assign a value to final variable
        double pi=4.31;
        System.out.println(obj.x,obj.pi);
    }
}
 
