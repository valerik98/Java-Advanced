package StreamsFilesAndDirectories;

import java.io.*;

public class P15MergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String inputTwo = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String output = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputp15.txt";
        try {
            BufferedReader inputOneReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputOne))));
            BufferedReader inputTwoReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputTwo))));
            PrintWriter out = new PrintWriter(new FileWriter(output));
            String line;
            while ((line = inputOneReader.readLine()) != null) {
                out.println(line);
            }
            while ((line = inputTwoReader.readLine()) != null){
                out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
