package com.mo.Threads;
//If the class extends the 'Thread' class, the thread can be run by creating an instance of the class and call its start() method.
public class threads1 extends Thread {
    public static void main(String[] args) {
        threads1 thread = new threads1();
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run(){
        System.out.println("This code is running in the thread.");
    }
}
