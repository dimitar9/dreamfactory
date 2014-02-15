package org.giddap.dreamfactory.javathreadprogramming;

import java.util.Set;

/**
 *
 */
public class TwoThreads extends Thread {
    private Thread creatorThread;

    public TwoThreads() {
        this.creatorThread = Thread.currentThread();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    private void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        Long id = t.getId();
        System.out.println("Thread name: " + name + " whith id: " + id);
    }

    public static void main(String[] args) {
        Set<Thread> threads = Thread.getAllStackTraces().keySet();
        for (Thread t : threads) {
            System.out.println("JVM thread name: " + t.getName());
        }


        TwoThreads tt = new TwoThreads();
        tt.start();

        try {
            Thread.currentThread().sleep(1L);
        } catch (InterruptedException ie) {
            System.exit(-1);
        }
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
    }
}
