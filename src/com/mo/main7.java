package com.mo;

enum level {
    LOW,
    MEDIUM,
    HIGH
}

class Main8 {
    void method1(){
        for(level myothervar :level.values())
        {
            System.out.println(myothervar);
        }
    }
}
public class main7{
    public static void main(String[] args) {
        level myvar = level.MEDIUM;
        switch (myvar){
            case LOW: {
                System.out.println("low level");
                break;
            }
            case MEDIUM: {
                System.out.println("medium level");
                break;
            }
            case HIGH: {
                System.out.println("high level");
                break;
            }
        }
        Main8 m1 = new Main8();
        m1.method1();
    }
}