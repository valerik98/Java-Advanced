package StreamsFilesAndDirectories;

import java.io.*;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output3.txt";

        try (
                BufferedReader bufferedReader = new BufferedReader
                        (new InputStreamReader(new FileInputStream(new File(inputPath))));
                PrintWriter out = new PrintWriter(new FileWriter(outputPath));
        ) {
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null){
                if (lineNumber % 3 == 0){
                    out.println(line);
                }
                lineNumber++;

            }
        }
    }
}
