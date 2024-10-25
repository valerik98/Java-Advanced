package SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        TreeMap<String,Double> studentScores = new TreeMap<>();
        int rows = Integer.parseInt (scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            String student = scanner.nextLine();
            Double averageScore = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .average().getAsDouble();

            studentScores.put(student,averageScore);
        }
        for (String student : studentScores.keySet()) {
            System.out.println(student + " is graduated with " + studentScores.get(student));
        }
    }
}
