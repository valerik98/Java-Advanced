package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (FileInputStream inputStream = new FileInputStream(path)) {
            int byteData = inputStream.read();
            while (byteData >= 0) {
                System.out.print(Integer.toBinaryString(byteData) + " ");
                byteData = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
