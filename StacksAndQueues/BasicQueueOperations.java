package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ntooffer = input[0];
        int spoll = input[1];
        int x = input[2];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < ntooffer; i++) {
            queue.offer(elements[i]);
        }
        for (int i = 0; i < spoll; i++) {
            queue.poll();
        }
        if (queue.contains(x)){
            System.out.println(true);
        }else {
            if (queue.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(queue));
            }

        }
    }
}
