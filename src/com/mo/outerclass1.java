package com.mo;

public class outerclass1 {
    int x=10;
    private class innerclass1{
        int y=5;
    }
}
class Main1{
    public static void main(String[] args) {
        outerclass1 myouter = new outerclass1();
        outerclass1.innerclass1 myinner = myouter.new innerclass1();
        System.out.println(myinner.y + myouter.x);
    }
}
