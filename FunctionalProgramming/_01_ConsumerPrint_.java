package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ConsumerPrint_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Consumer<String> print = System.out::println;
        for (String name : input.split("\\s+")) {
            print.accept(name);
        }
    }
}
