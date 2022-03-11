package com.mo;

public class outerclass3 {
    int x=10;
    class innerclass3{
        public int myinnermethod(){
            return x;
        }
    }
}
class mainA{
    public static void main(String[] args) {
        outerclass3 myouter = new outerclass3();
        outerclass3.innerclass3 myinner = myouter.new innerclass3();
        System.out.println(myinner.myinnermethod());
    }
}
