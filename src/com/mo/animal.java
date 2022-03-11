package com.mo;

public class animal {
    public void animalsound(){
        System.out.println("The animal makes a sound");
    }
}
class pig extends animal{
    public void animalsound(){
        System.out.println("The pig says : wee wee");
    }
}
class dog extends animal{
    public void animalsound(){
        System.out.println("The dog says : bow bow");
    }
}
class main1{
    public static void main(String[] args) {
        animal myanimal = new animal();
        animal mypig = new pig();
        animal mydog = new dog();
        myanimal.animalsound();
        mypig.animalsound();
        mydog.animalsound();
    }
}
