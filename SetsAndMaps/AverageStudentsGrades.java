package SetsAndMaps;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = "";
        TreeMap<String, List<Double>> record = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            String student = input.split("\\s+")[0]; // Petar
            double grade = Double.parseDouble(input.split("\\s+")[1]); // 6

            if (record.containsKey(student)) {
                record.get(student).add(grade);
            } else {
                record.put(student, new ArrayList<>());
                record.get(student).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> entry : record.entrySet()) {
            double averageGrade = calculateAverage(entry.getValue());
            //alex -> 2 3 (avg: 2)

            System.out.printf("%s -> ", entry.getKey());
            for (Double grade : entry.getValue()) {
                System.out.printf("%.2f ",grade);
            }
            System.out.printf("(avg: %.2f)\n",averageGrade);
        }

    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0;
        int countGrades = grades.size();
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / countGrades;
    }
}
