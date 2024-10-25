package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //{[()]}
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (int position = 0; position < input.toCharArray().length; position++) {
            char currentSymbol = input.charAt(position);
            char previousSymbol = input.charAt(position-1);
            queue.offer(currentSymbol);

            if (currentSymbol == ')') {
                if (previousSymbol == '('){
                    queue.remove(currentSymbol);
                    queue.remove(previousSymbol);
                }
            } else if (currentSymbol == '}') {
                if (previousSymbol == '{'){
                    queue.remove(currentSymbol);
                    queue.remove(previousSymbol);
                }
            } else if (currentSymbol == ']') {
                if (previousSymbol == '['){
                    queue.remove(currentSymbol);
                    queue.remove(previousSymbol);
                }
            }
        }
        if (queue.isEmpty()){
            System.out.println("YES");
        }

    }
}
