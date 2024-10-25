package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String filename = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while(!filename.equals("print")){
            if (!filename.equals("cancel")){
                printerQueue.offer(filename);
            } else {
                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + printerQueue.poll());
                }

            }
            filename = scanner.nextLine();
        }
        printerQueue.forEach(System.out::println);
    }
}
