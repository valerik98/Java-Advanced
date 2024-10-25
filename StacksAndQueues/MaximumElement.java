package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            //"1 X" - Push the element X into the stack.
            //
            //· "2" - Delete the element present at the top of the stack.
            //
            //· "3" - Print the maximum element in the stack.
            String commandNumber = command.split("\\s+")[0];
            switch (commandNumber){
                case "1":
                    int x = Integer.parseInt(command.split(" ")[1]);
                    stack.push(x);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }


    }
}
