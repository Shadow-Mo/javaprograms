package com.mo.Threads;
//use 'isAlive()' of the thread to check whether the thread has finished running before using any attrubutes that the thread can change.
public class threads4 extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        threads4 thread = new threads4();
        thread.start();
//        Wait for the thread to finish
        while (thread.isAlive()){
            System.out.println("Waiting...");
        }
//        Update amount and print its value
        System.out.println("Main: " +amount);
        amount++;
        System.out.println("Main: " +amount);
    }
    public void run(){
        amount++;
    }
}
