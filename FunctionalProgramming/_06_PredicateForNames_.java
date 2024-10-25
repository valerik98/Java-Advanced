package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        Predicate<Integer> checkLength = length -> length <= n;
        String token = scanner.nextLine();
        for (String name : token.split("\\s+")) {
            if (checkLength.test(name.length())){
                System.out.println(name);
            }
        }
    }
}
