package com.mo;

public class outerclass2 {
    int x=10;
    static class innerclass2{
        int y=10;
    }
}
class main2{
    public static void main(String[] args) {
        outerclass2.innerclass2 myinner = new outerclass2.innerclass2();
        System.out.println(myinner.y);
    }
}
