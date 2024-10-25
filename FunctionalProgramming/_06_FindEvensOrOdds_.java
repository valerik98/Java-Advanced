package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_FindEvensOrOdds_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bounds = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int upperBound = bounds[1];
        int lowerBound = bounds[0];

        String command = scanner.nextLine();
        Predicate<Integer> predicate;
        if (command.equals("odd")) {
            predicate = number -> number % 2 != 0;
            printNumber(upperBound,lowerBound,predicate);

        } else if (command.equals("even")) {
            predicate = number -> number % 2 == 0;
            printNumber(upperBound,lowerBound,predicate);
        }


    }
    public static int printNumber (int upperBound, int lowerBound,Predicate<Integer> predicate){
        for (int number = lowerBound; number <= upperBound ; number++) {
            if (predicate.test(number)){
                System.out.print(number + " ");
            }
        }
        System.out.println();
        return 0;
    }
}
