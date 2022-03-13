package com.mo;

public interface animal2 {
    public void animalsound();
    public void sleep1();
}
class pig2 implements animal2{
    public void animalsound(){
        System.out.println("Pig says : wee wee");
    }
    public void sleep1(){
        System.out.println("zzz");
    }
}
class Main{
    public static void main(String[] args) {
        pig2 mypig = new pig2();
        mypig.animalsound();
        mypig.sleep1();
    }
}