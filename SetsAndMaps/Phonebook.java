package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        LinkedHashMap<String,String> phonebook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("search")){
            String name = input.split("-")[0];
            String number = input.split("-")[1];
            phonebook.put(name,number);
            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        while(!input2.equals("stop")){
            if (phonebook.containsKey(input2)){
                System.out.println(input2 + " -> " + phonebook.get(input2));
            }else {
                System.out.printf("Contact %s does not exist.\n", input2);
            }
            input2 = scanner.nextLine();
        }
    }
}
