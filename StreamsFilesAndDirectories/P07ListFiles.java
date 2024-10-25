package StreamsFilesAndDirectories;

import java.io.File;

public class P07ListFiles {
    public static void main(String[] args) {
        String path = "D:\\softuni\\trebwat_mi_pari\\Softuni\\Advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            return;
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(String.format("%s: [%d]", file.getName(), file.length()));
            }
        }
    }
}
