package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner (System.in);
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        List<Character> punctuation = Arrays.asList(',', '.', '?', '!');

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream(outputPath);
            int byteData = inputStream.read();

            while (byteData >= 0){
                if (!punctuation.contains((char) byteData)){
                    outputStream.write(byteData);
                }
                byteData = inputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
