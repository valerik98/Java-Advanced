package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P16GetFolderSize {

    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        Path folder = Paths.get(path);
        long size = Files.walk(folder)
                .filter(p -> p.toFile().isFile())
                .filter(p -> !p.toFile().getName().equals("output.txt"))
                .filter(p -> !p.toFile().getName().equals("result.txt"))
                .mapToLong(p -> p.toFile().length())
                .sum();

        System.out.println(String.format("Folder size: %d", size));

    }
}
