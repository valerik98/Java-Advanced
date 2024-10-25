package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");
                }
            }

        }
        System.out.println();
        for (int row = n ; row > 0; row--) {
            System.out.print(matrix[row-1][n - row] + " ");
        }
    }
}
