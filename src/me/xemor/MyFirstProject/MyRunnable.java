package me.xemor.MyFirstProject;

public class MyRunnable implements Runnable {

    private int startingThread;

    public MyRunnable(int startingInteger) {
        this.startingThread = startingInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            startingThread++;
        }
        System.out.println(startingThread);
    }

}
