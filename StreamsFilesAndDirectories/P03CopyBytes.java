package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output2.txt";


        try (
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath)
        ) {
            int oneByte = fileInputStream.read();
            while (oneByte >= 0){
                String digits = String.valueOf(oneByte);
                if (oneByte == 32) {
                    fileOutputStream.write(' ');
                } else if (oneByte == 10) {
                    fileOutputStream.write('\n');
                } else {
                    for (int i = 0; i < digits.length(); i++) {
                        fileOutputStream.write(digits.charAt(i));
                    }
                }
                oneByte = fileInputStream.read();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
