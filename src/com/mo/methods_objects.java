package com.mo;

public class methods_objects {
    public void fullthrottle(){
        System.out.println("This car is going as fast as it can");
    }
    public void speed(int maxspeed){
        System.out.println("Speed :"+maxspeed);
    }

    public static void main(String[] args) {
        methods_objects mycar = new methods_objects();
        mycar.fullthrottle();
        mycar.speed(200);
    }
}
