package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        LinkedHashMap<Double, Integer> result = new LinkedHashMap<>();
        for (double number : numbers) {
           if (!result.containsKey(number)){
               result.put(number,1);
           }else {
               result.put(number,result.get(number) + 1);
           }
        }

        for (Double key : result.keySet()) {
            System.out.println(key + " -> " + result.get(key));
        }

    }
}
