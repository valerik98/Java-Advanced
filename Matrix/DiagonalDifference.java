package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        int[][] matrix = new int[n][n];
        int firstSum = 0;
        int secondSum = 0;

        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int row = 0; row < n; row++) {
            firstSum+=matrix[row][row];
        }
        for (int row = 0; row < n; row++) {
            secondSum += matrix[n-row-1][row];
        }
        System.out.println(Math.abs(firstSum-secondSum));

//        for (int row = 0; row < n; row++) {
//            for (int col = 0; col < n; col++) {
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println();
//        }

    }
}


