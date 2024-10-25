package StreamsFilesAndDirectories;

import java.io.*;

public class P09SumLines {
    public static void main(String[] args) throws IOException {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))))) {
            String s = bufferedReader.readLine();
            while (!s.equals(null)) {
                int sumLine = 0;
                for (int i = 0; i < s.toCharArray().length; i++) {
                    int number = (int) s.toCharArray()[i];
                    sumLine += number;
                }
                System.out.println(sumLine);
                s = bufferedReader.readLine();
            }
        }
    }
}
