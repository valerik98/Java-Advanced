package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        while(!name.equals("stop")){
            String email = scanner.nextLine();
            if (email.contains(".com") || email.contains(".us") || email.contains(".uk")){
            }else {
                map.put(name,email);
            }
            name = scanner.nextLine();

        }
        for (String s : map.keySet()) {
            System.out.println(s + " -> " + map.get(s));
        }
    }
}
