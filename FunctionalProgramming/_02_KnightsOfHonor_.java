package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class _02_KnightsOfHonor_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Consumer<String> print = name -> System.out.println("Sir " + name);

        for (String name : input.split(" ")) {
            print.accept(name);
        }
    }
}
