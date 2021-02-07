package StacksAndQueues;
//created by J.M.

import java.util.*;

public class PrinterQueue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!"print".equals(input = scan.nextLine())) {
            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(input);
            }
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
