package SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt (scanner.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            elements.addAll(Arrays.asList(input));
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
