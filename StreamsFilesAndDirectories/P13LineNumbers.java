package StreamsFilesAndDirectories;

import java.io.*;

public class P13LineNumbers {
    public static void main(String[] args) {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String line = bufferedReader.readLine();
            int row = 1;
            while (line != null) {
                System.out.println(row + ". " + line);
                row++;
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
