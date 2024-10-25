package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] token = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfElementsToPush = token[0];
        int numberOfElementsToPop = token[1];
        int elementX = token[2];
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfElementsToPush; i++) {
            stack.push(input[i]);
        }
        for (int i = 0; i < numberOfElementsToPop; i++) {
            stack.pop();
        }
        if (stack.contains(elementX)) {
            System.out.println(true);
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
