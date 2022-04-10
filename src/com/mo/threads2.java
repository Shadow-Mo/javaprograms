package com.mo.Threads;
//If the class implements the 'Runnable' interface, the thread can be run by passing an instance of the class to a 'Tread'objects constructor and then calling the threads 'start()' method
public class threads2 implements Runnable {
    public static void main(String[] args) {
        threads2 obj = new threads2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread.");
    }
    public void run(){
        System.out.println("This code is running in a thread.");
    }
}
