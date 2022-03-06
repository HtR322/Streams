package ru.htr.streams;

public class DaemonStream extends Thread {
     public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print("Прошла секунда");
            if (Thread.currentThread().isDaemon()) System.out.println("(◣_◢)");
        }
         System.out.println("Are you still watching? (ಠ_ಠ)");
    }
}
