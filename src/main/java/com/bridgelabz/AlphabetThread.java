package com.bridgelabz;

public class AlphabetThread extends Thread{
    @Override
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");

        }
    }
}

