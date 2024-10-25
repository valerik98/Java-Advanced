package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_ListOfPredicates_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                                 .map(Integer::parseInt).collect(Collectors.toList());

//        Predicate<Integer> isDivisible = number ->

        for (int i = 1; i <=n; i++) {

        }
    }
}
