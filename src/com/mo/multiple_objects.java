package com.mo;
//change the value of x in myobj2 & leave x in myobj1 unchanged
public class multiple_objects {
    int x=5;

    public static void main(String[] args) {
        multiple_objects myobj1 = new multiple_objects();
        multiple_objects myobj2 = new multiple_objects();
        myobj2.x = 10;
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
