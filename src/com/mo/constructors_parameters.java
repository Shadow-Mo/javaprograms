package com.mo;
//The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

public class constructors_parameters {
    int x;
    public constructors_parameters(int y){
        x=y;
    }

    public static void main(String[] args) {
        constructors_parameters myobj = new constructors_parameters(5);
        System.out.println(myobj.x);
    }
}
