package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AddVAT_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        Function<Double, Double> addVAT = price -> price *= 1.2;
        System.out.println("Prices with VAT:");
        for (Double price : prices) {
            Double priceWithVAT = addVAT.apply(price);
            System.out.printf("%.2f\n",priceWithVAT);
        }

    }
}
