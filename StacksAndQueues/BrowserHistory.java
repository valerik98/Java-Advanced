package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> Stack = new ArrayDeque<>();


        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (Stack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    Stack.pop();
                    System.out.println(Stack.peek());
                }

            } else {
                Stack.push(input);
                System.out.println(Stack.peek());
            }
            input = scanner.nextLine();
        }
    }
}
