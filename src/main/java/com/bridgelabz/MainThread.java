package com.bridgelabz;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = new AlphabetThread();
        thread.start();

        Runnable runnable = new NumberThread();
        Thread thread1 = new Thread(runnable);
        thread1.start();


    }


}
