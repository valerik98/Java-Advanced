package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class P14WordCount {
    public static void main(String[] args) {
//        String inputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
//        String search = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
//        String outputPath = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
//        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();
//        try {
//            BufferedReader wordsReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath))));
//            BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(search))));
//            PrintWriter out = new PrintWriter(new FileWriter(outputPath));
//            String line;
//            while ((line = wordsReader.readLine()) != null) {
//                Arrays.stream(line.trim().split("\\s+")).forEach(word -> words.putIfAbsent(word, 0));
//            }
//            while ((line = textReader.readLine()) != null) {
//                String[] tokens = line.split("\\s+");
//                for (String token : tokens) {
//                    if (words.containsKey(token)) {
//                        words.put(token, words.get(token) + 1);
//                    }
//                }
//            }
//            words.entrySet()
//                    .stream()
//                    .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
//                    .forEach(entry -> {
//                        out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
//                    });
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        String basePath = "D:\\\\softuni\\\\trebwat_mi_pari\\\\Softuni\\\\Advanced\\\\src\\\\StreamsFilesAndDirectories\\\\Exercises 04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        String inputPath = basePath + "\\words.txt";
        String search = basePath + "\\text.txt";
        String outPath = basePath + "\\4output.txt";
        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        try (
                BufferedReader wordsReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File(inputPath)
                                )
                        )
                );
                BufferedReader textReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File(search)
                                )
                        )
                );
                PrintWriter out = new PrintWriter(new FileWriter(outPath))
        ) {
            String line;

            while ((line = wordsReader.readLine()) != null) {
                Arrays.stream(line.trim().split("\\s+")).forEach(word -> {
                    words.putIfAbsent(word, 0);
                });
            }


            while ((line = textReader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String word : tokens) {
                    if (words.containsKey(word)) {
                        words.put(word, words.get(word) + 1);
                    }
                }
            }

            words.entrySet()
                    .stream()
                    .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                    .forEach(entry -> {
                        out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
                    });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
