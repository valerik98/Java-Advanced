package StreamsFilesAndDirectories;

import java.io.*;

public class P10SumBytes {
    public static void main(String[] args) {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String s = bufferedReader.readLine();
            int sumLine = 0;
            int number = 0;
            while (s != null) {
                for (int i = 0; i < s.toCharArray().length; i++) {
                    number = s.toCharArray()[i];
                    sumLine += number;
                }
                s = bufferedReader.readLine();
            }
            System.out.println(sumLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
