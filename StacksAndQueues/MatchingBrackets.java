package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> indexOfOpeningBrackets = new ArrayDeque<>();

        for (int position = 0; position < input.length(); position++) {
            char symbol = input.charAt(position);
            if (symbol == '('){
                indexOfOpeningBrackets.push(position);
            }else if (symbol == ')'){
                System.out.println(input.substring(indexOfOpeningBrackets.pop(),position+1));
            }

        }

    }
}
