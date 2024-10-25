package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _02_SumNumbers_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Count = " + numbers.size());

        Function<List<Integer>, Integer> getSum = num -> {
            int sum = 0;
            for (Integer i : num) {
                sum += i;
            }
            return sum;
        };

        System.out.println("Sum = " + getSum.apply(numbers));
    }
}
