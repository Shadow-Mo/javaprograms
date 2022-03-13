package com.mo;

abstract class animal1 {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("zzz");
    }
}
class pig1 extends animal1{
    public void animalsound(){
        System.out.println("Pig1 says : wee wee");
    }
}
class Main{
    public static void main(String[] args) {
        pig1 mypig = new pig1();
        mypig.animalsound();
        mypig.sleep();
    }
}
