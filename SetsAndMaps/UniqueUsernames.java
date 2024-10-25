package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        for (int row = 0; row < rows; row++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
