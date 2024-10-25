package StreamsFilesAndDirectories;

import java.io.*;

public class P11ALLCAPS {
    public static void main(String[] args) {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                    (new FileInputStream(new File(path))));
            String s = bufferedReader.readLine();
            String upperCase = s.toUpperCase();
            while(s!=null){
                upperCase = s.toUpperCase();
                System.out.println(upperCase);
                s = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
