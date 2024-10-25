package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P06SortLines {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output4.txt";

        try {
            PrintWriter out = new PrintWriter(new FileWriter(outputPath));
            Files.readAllLines(Paths.get(inputPath))
                    .stream()
                    .filter(s -> !s.isEmpty())
                    .sorted()
                    .forEach(out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
