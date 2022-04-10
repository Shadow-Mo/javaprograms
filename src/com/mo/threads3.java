package com.mo.Threads;
//bcoz threads run at the same time there is no way to know in which order code will run. The values are unpredictable
public class threads3 extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        threads3 thread = new threads3();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
