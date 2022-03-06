package ru.htr.streams;

import java.util.Scanner;

public class StreamWriter extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        System.out.println(in);
    }
}
