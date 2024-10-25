package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        LinkedHashSet<Integer> setN = new LinkedHashSet<>();
        LinkedHashSet<Integer> setM = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            setN.add(scanner.nextInt());
        }
        for (int i = 0; i < m; i++) {
            setM.add(scanner.nextInt());
        }
        setN.retainAll(setM);
        setN.forEach(u -> System.out.print(u + " "));


    }
}
