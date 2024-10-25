package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _03_CountUpperCaseWords_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Predicate<String> isUpperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).filter(isUpperCase).collect(Collectors.toList());

        System.out.println(words.size());
        words.forEach(System.out::println);







//
//        for (String word : input.split("\\+")) {
//            if (isUpperCase.test(word)) {
//                count ++;
//                upperCaseWords.add(word);
//            }
//        }
//
//        System.out.println(count);
//        for (String word : upperCaseWords) {
//            System.out.println(word);
//        }

    }
}
