package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class P04ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String inputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output2.txt";

        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputPath));
            FileOutputStream outputStream = new FileOutputStream(outputPath);
            while(inputStream.hasNext()){
                if (inputStream.hasNextInt()){
                    System.out.println(inputStream.nextInt());
                }
                inputStream.next();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
