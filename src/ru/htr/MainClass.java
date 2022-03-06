package ru.htr;

import ru.htr.streams.DaemonStream;
import ru.htr.streams.StreamWriter;

public class MainClass {
    public static void main(String[] args) {
        Thread mainThread = new Thread();
        DaemonStream daemon = new DaemonStream();
        StreamWriter exorcist = new StreamWriter();
        daemon.setDaemon(true);
        daemon.start();
        exorcist.start();
        try {
            exorcist.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        mainThread.start();
        if (daemon.isAlive()) {
            System.out.println("Изгоняем демона...");
            try {
                mainThread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Демон изгнан");
        }
    }
}