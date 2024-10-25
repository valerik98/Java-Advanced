package Matrix;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rowsAndCols = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        if (pattern.equals("A")) {
            int value = 1;
            for (int row = 0; row < rowsAndCols; row++) {
                for (int col = 0; col < rowsAndCols; col++) {
                    matrix[col][row] = value;
                    value++;
                }
            }
        } else if (pattern.equals("B")) {
            int value = 1;
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = value++;
                    }
                } else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = value++;
                    }
                }
            }

        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
