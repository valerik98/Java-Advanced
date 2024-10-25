package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        int[][] subMatrix = new int[2][2];



        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = Integer.MIN_VALUE;
        int currentRow = -1;
        int currentCol = -1;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentSum = getSumFromTopLeft(subMatrix, row, col);
                if (currentSum > sum) {
                    sum = currentSum;
                    currentRow = row;
                    currentCol = col;
                }
            }

        }
        System.out.printf("%d %d\n%d %d\n%d",
                subMatrix[currentRow][currentCol], subMatrix[currentRow + 1][currentCol],
                subMatrix[currentRow][currentCol + 1], subMatrix[currentRow + 1][currentCol + 1],
                sum);


    }

    private static int getSumFromTopLeft(int[][] subMatrix, int row, int col) {

        return subMatrix[row][col] + subMatrix[row + 1][col] + subMatrix[row][col + 1] + subMatrix[row + 1][col + 1];
    }
}
