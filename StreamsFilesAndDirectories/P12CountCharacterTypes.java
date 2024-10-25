package StreamsFilesAndDirectories;

import java.io.*;

public class P12CountCharacterTypes {
    public static void main(String[] args) {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String data = bufferedReader.readLine();
            int vowels = 0;
            int punct = 0;
            int others = 0;

            while (data != null) {
                for (int i = 0; i < data.toCharArray().length; i++) {
                    char currentSymbol = data.toCharArray()[i];
                    if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u') {
                        vowels++;
                    } else if (currentSymbol == ',' || currentSymbol == '!' || currentSymbol == '.' || currentSymbol == '?') {
                        punct++;
                    } else if (currentSymbol == ' '){

                    } else {
                        others++;
                    }
                }

                data = bufferedReader.readLine();
            }
            System.out.println(String.format("Vowels: %d",vowels));
            System.out.println(String.format("Other symbols: %d",others));
            System.out.println(String.format("Punctuation: %d",punct));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
