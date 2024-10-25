package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> guestList = new LinkedHashSet<>();

        while (!input.equals("PARTY")) {
            guestList.add(input);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {


            input = scanner.nextLine();
        }

    }
}
