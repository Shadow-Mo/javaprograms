package com.mo;

public class override_value {
    int x=10;

    public static void main(String[] args) {
        override_value myobj = new override_value();
        myobj.x = 25;
        System.out.println(myobj.x);
    }
}
